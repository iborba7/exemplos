function fechamentoModel1() {
  
  var ss3 = SpreadsheetApp.getActiveSpreadsheet();//Retorna a planilha que está sendo editada
  //var ss2 = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();
  var sheets = ss3.getSheets();//Retorna um Array com todas as planilhas
  var ss1 = SpreadsheetApp.getActiveSpreadsheet(); //retorna a planilha sendo editada
  var insertValue = new Array;//Cria um novo Array
  var insertDateTime = new Array;
  var mPLength = new Array;
  mPLength = SpreadsheetApp.getActiveSpreadsheet().getSheetByName('Matérias Primas Ativas').getRange('D85').getValues();
  //Logger.log(mPLength.length);
  
 for (var j=0; j <= mPLength-2; j++ ){ //Loop de acesso as planilhas
  
  var ws = sheets;//Retorna a planilha que está sendo editada
  ws[j].activate();//acessa as planilhas e ativa
  
  var ss2 = SpreadsheetApp.getActiveSpreadsheet().getActiveSheet();// retorna a planilha ativa
  var dataRangeValues = ss2.getRange("C12:C44").getValues();//retorna o range da planilha ativa
  
 for (var i=0; i <= dataRangeValues.length; i++){ //Loop que faz a leitura das Rows do intervalo especificado
 
 if (dataRangeValues[i] == ""){ //comando de seleção das Rows que estão em branco       
       
       insertValue = [];
       insertDateTime = [];
       insertValue.push('QUALQUER VALOR');
       insertDateTime.push(new Date());
       
       ss2.getRange((12+i), 3, (i-(i-1))).setValue(insertValue.toString());//Insere valor na Row
       ss2.getRange((12+i), 2, (i-(i-1))).setValue(insertDateTime.toString());
      //Browser.msgBox(dataRangeValues[i]);
      
      break;
      
       }
    
    }
    }
    }


  
