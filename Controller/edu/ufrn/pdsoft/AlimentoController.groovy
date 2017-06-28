package edu.ufrn.pdsoft

import edu.ufrn.pdsoft.model.Alimento

import jxl.DateCell
import jxl.LabelCell
import jxl.NumberCell
import jxl.Sheet
import jxl.Workbook

class AlimentoController {

	private final static int COLUMN_NAME = 0
    private final static int COLUMN_CALORIES = 1
    private final static int COLUMN_PROTEINS = 2
    private final static int COLUMN_CALCIUM = 3

	def upload() { }

	 def index() {
        redirect(action: "list", params: params)
    }

   	def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [foodInstanceList: Alimento.list(params), foodInstanceTotal: Alimento.count()]
    }


    def doUpload() {
        def file = request.getFile('file')
        Workbook workbook = Workbook.getWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheet(0)
        int errorRows = 0;
        List<String> errorRowName = new ArrayList<>()

        // skip first row (row 0) by starting from 1
        for (int row = 1; row < sheet.getRows(); row++) {
            LabelCell foodName = sheet.getCell(COLUMN_NAME, row)
            NumberCell foodCalories = sheet.getCell(COLUMN_CALORIES, row)
            NumberCell foodProteins = sheet.getCell(COLUMN_PROTEINS, row)
            NumberCell calciumValue = sheet.getCell(COLUMN_CALCIUM, row)

            def novoAlimento = new Alimento(nome:foodName.string , calorias:foodCalories.value ,
                    proteinas: foodProteins.value, calcio:calciumValue.value)
            if (novoAlimento.validate()) {
                novoAlimento.save()
            } else {
                errorRows++
                errorRowName.append(foodName.string)
            }
        }
        redirect (action:'list', params: [errorCount: errorRows, errorList: errorRowName])
    }

}
