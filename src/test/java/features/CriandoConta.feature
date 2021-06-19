#language: pt
Funcionalidade: criando conta
  
  Cenario: Cadastrar um usuario
  Dado que estou com a aplicacao aberta 
  E informo os dados enter vehicle data 
  
  |Audi    |
  |Scooter |
  |2       |
  |2       |
  |1       |
  |1       |
  |Petrol  |
  |1       |
  |120     |
  |501     |
  |23      |
  |201     |
  
 E informo os dados enter insurant data
 
  |fernando|
  |felipe  |
  |04/20/1995|
  |rua oli   |
  |Andorra    |
  |92098283   |
  |sao paulo  |
  |Farmer   | 

  E informo os dados enter Product Data
  
  |04/20/2022|
  |3.000.000,00|
  |Super Bonus|
  |No Coverage| 
  |Yes|
  
  E seleciono Price optionProduct 
 
  |Ultimate|
  
  E preencho o formulador de login send quote
  |test@sampleapp.com  |
  |1193882823|
  |de883j3|
  |D66778f|
  |D66778f|
  |ok|
  
  Entao valido a mensagem email enviado com sucesso
  
  
  