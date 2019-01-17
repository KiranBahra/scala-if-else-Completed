package services

object ConditionalService {

  def moreThanThree(x: Int): String ={
    if (x > 3){
      return "more"
    }
    else if (x <= 3){
      return "not more"
    }else{
      return ""
    }

  }




  def lessThanThree(x: Int): String = {
    if (x <3){
      return "less"
    }else if (x >= 3){
      return "not less"
    }else {
      return ""
    }
  }

  def moreThanOrEqualToThree(x: Int): String = {
    if (x >= 3){
      return "more or equal"

    }else if (x<3){
      return "not more"
    }else{
      return ""
    }
  }

  def lessThanOrEqualToThree(x: Int): String = {
    if (x <=3){
      return "less or equal"
    }else if ( x>3){
      return "not less"
    }else{
      return ""
    }
  }

  def isItASheep(possibleSheep: String): String = {
    if (possibleSheep == "sheep"){
      return "it is a sheep"
    }else if (possibleSheep== "cow"){
      return "it is not a sheep"
    }else {
      return ""
    }
  }

  def isItASheepOrCow(possiblePoultryOrBovine: String): String = {
    if (possiblePoultryOrBovine=="sheep" || possiblePoultryOrBovine=="cow"){
      return "yes"
    }else if (possiblePoultryOrBovine=="chicken"){
      return "no"
    }else{
      return ""
    }
  }

  def isItASheepOrBrownCow(possiblePoultryOrBovine: String, colour: String): String = {
if (possiblePoultryOrBovine=="sheep" || possiblePoultryOrBovine=="cow"){
  if (colour=="brown" || colour=="pink"){
    return "yes"
  }else {
    return "no"
  }
}else if(possiblePoultryOrBovine=="cow" || possiblePoultryOrBovine=="chicken"){
  if (colour=="grey" || colour=="red"){
    return "no"
  }else{
    return "no"
  }
} else return "no"
  }

  def stringContainsHello(str: String): String = {
    if (str.contains("Hello")){
      return "it does"
    }else{
      return "it doesn't"
    }
  }
  //change the return type as test required a string?
  def moreThanTenMoreThanTwenty(x: Int): String = {
    if (x>20){
      return "more than 20"
    }else if (x > 10 && x <=20){
      return "more than 10"
    }else if (x <=10) {
      return "not more than 10"
    }else {
      return ""
    }
  }
  //change the return type as test required a string?
  def divideIfEvenMultiplyIfOdd(num: Int, factor: Int): Int= {
    if (num % 2 ==0){
      val e =num/factor
      return e
    }else{
      val o= num * factor
      return o
    }
  }

  def getResponseType(httpResponseStatus: Int): String = {
    if (httpResponseStatus==199 || httpResponseStatus==600){
      return "not a valid code"
    }else if (httpResponseStatus==200 || httpResponseStatus==202 || httpResponseStatus==299){
      return "here you go"
    }else if (httpResponseStatus==300 || httpResponseStatus==303|| httpResponseStatus==399){
     return "you're looking in the wrong place"
    }else if (httpResponseStatus==400 || httpResponseStatus==403 || httpResponseStatus==499){
      return "error - your fault"
    }else if (httpResponseStatus==500 || httpResponseStatus==503 || httpResponseStatus==599){
      return  "error - my fault"
    }else {
      return ""
    }


  }

  def getResponseTypeWithDetail(httpResponseStatus: Int): String = {
    if (httpResponseStatus==199 || httpResponseStatus==600){
      return "not a valid code"
    }else if (httpResponseStatus==200 || httpResponseStatus==299){
      return "here you go"
    }else if (httpResponseStatus==202){
      return "here you go: ACCEPTED"
    }else if (httpResponseStatus==300 || httpResponseStatus==399){
      return "you're looking in the wrong place"
    }else if (httpResponseStatus==303){
      return "you're looking in the wrong place: REDIRECT"
    }else if (httpResponseStatus==400 || httpResponseStatus==499){
      return "error - your fault"
    }else if (httpResponseStatus==403){
      return "error - your fault: FORBIDDEN"
    }else if (httpResponseStatus==500 || httpResponseStatus==599){
      return "error - my fault"
    }else if (httpResponseStatus==503){
      return "error - my fault: SERVICE UNAVAILABLE"
    }else {
      return ""
    }

  }
}
