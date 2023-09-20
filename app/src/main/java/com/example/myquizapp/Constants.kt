package com.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_india,"Bharat","Austrailia","Austria","Armenia"
            ,1
        )
        val que2 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,"Bharat","Australia","Argentina","Armenia"
            ,3
        )
        val que3= Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,"Fiji","Australia","Austria","Kuwait"
            ,2
        )
        val que4 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,"Bharat","Belgium","Fiji","Germany"
            ,2
        )
        val que5 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,"Australia","New zealand","Austria","Brazil"
            ,4
        )
        val que6 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,"Bharat","Kuwait","Denmark","Armenia"
            ,3
        )
        val que7 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,"Fiji","Australia","New zealand","Denmark"
            ,1
        )
        val que8 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,"Bharat","Armenia","Austria","Germany"
            ,4
        )
        val que9 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,"Fiji","Australia","Kuwait","Armenia"
            ,3
        )
        val que10 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,"Germany","Belgium","New Zealand","Argentina"
            ,3
        )
        questionList.add(que1)
        return questionList
    }


}