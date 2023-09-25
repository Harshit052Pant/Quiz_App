package com.example.myquizapp

object Constants {


    const val USER_NAME : String = "user_name"
    const val TOTAL_OUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correc_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_india,"Bharat","Austrailia","Austria","Armenia"
            ,1
        )
        val que2 = Question(
            2,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,"Bharat","Australia","Argentina","Armenia"
            ,3
        )
        val que3= Question(
            3,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,"Fiji","Australia","Austria","Kuwait"
            ,2
        )
        val que4 = Question(
            4,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,"Bharat","Belgium","Fiji","Germany"
            ,2
        )
        val que5 = Question(
            5,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,"Australia","New zealand","Austria","Brazil"
            ,4
        )
        val que6 = Question(
            6,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,"Bharat","Kuwait","Denmark","Armenia"
            ,3
        )
        val que7 = Question(
            7,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,"Fiji","Australia","New zealand","Denmark"
            ,1
        )
        val que8 = Question(
            8,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,"Bharat","Armenia","Austria","Germany"
            ,4
        )
        val que9 = Question(
            9,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,"Fiji","Australia","Kuwait","Armenia"
            ,3
        )
        val que10 = Question(
            10,"What country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,"Germany","Belgium","New Zealand","Argentina"
            ,3
        )
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)
        return questionList
    }


}