function fechamentoClean() {
  
  var ss3 = SpreadsheetApp.getActiveSpreadsheet();//Retorna a planilha que está sendo editada
  //var ss2 = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();
  var sheets = ss3.getSheets();//Retorna um Array com todas as planilhas
  var ss1 = SpreadsheetApp.getActiveSpreadsheet(); //retorna a planilha sendo editada
  //Retorna um Array de valores do intervalo
  var insertValue = new Array;//Cria um novo Array
  var insertDateTime = new Array;
  var mPLength = new Array;
  mPLength = SpreadsheetApp.getActiveSpreadsheet().getSheetByName('Matérias Primas Ativas ').getRange('D85').getValues();
  //Logger.log(mPLength.length);
  
 for (var j=0; j <= mPLength-2; j++ ){ //Loop de acesso as planilhas
  
  var ws = sheets;//Retorna a planilha que está sendo editada
  ws[j].activate();//acessa as planilhas e ativa
  
  var ss2 = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();// retorna a planilha ativa
  var dataRangeValues = ss2.getRange("B10:B44");//retorna o range da planilha ativa
  var dataRangeValues2 = ss2.getRange("C10:C44");
  var dataRangeValues3 = ss2.getRange("D10:D44");
  var dataRangeValues4 = ss2.getRange("E10:E44");
  var dataRangeValues5 = ss2.getRange("F10:F44");
  var dataRangeValues6 = ss2.getRange("H10:H44");
  var dataRangeValues7 = ss2.getRange("L10");
  var dataRangeValues8 = ss2.getRange("N10");
  var dataRangeValues9 = ss2.getRange("M10");


             dataRangeValues.clearContent();
             dataRangeValues2.clearContent();
             dataRangeValues3.clearContent();
             dataRangeValues4.clearContent();
             dataRangeValues5.clearContent();
             dataRangeValues6.clearContent();
             dataRangeValues7.clearContent();
             dataRangeValues8.clearContent();
             dataRangeValues9.clearContent();

    
      
      

      
      
    }
      
    }



  
