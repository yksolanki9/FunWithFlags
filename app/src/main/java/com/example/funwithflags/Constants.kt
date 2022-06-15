package com.example.funwithflags

object Constants {
    fun getQuestions(): ArrayList<Question> {
        return arrayListOf(
            Question(1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
                arrayListOf("Argentina", "Australia", "Armenia", "Austria"), 1),
            Question(2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
                arrayListOf("Angola", "Austria", "Australia", "Armenia"), 3),
            Question(3, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
                arrayListOf("Belarus", "Belize", "Brunei", "Brazil"), 4),
            Question(4, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
                arrayListOf("Bahamas", "Belgium", "Barbados", "Belize"), 2),
            Question(5, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
                arrayListOf("Gabon", "France", "Fiji", "Finland"), 3),
            Question(6, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
                arrayListOf("Germany", "Georgia", "Greece", "none of these"), 1),
            Question(7, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
                arrayListOf("Dominica", "Egypt", "Denmark", "Ethiopia"), 3),
            Question(8, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
                    arrayListOf("Ireland", "Iran", "Hungary", "India"), 4),
            Question(9, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
                    arrayListOf("Australia", "New Zealand", "Tuvalu", "United States of America"), 2),
            Question(10, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
                    arrayListOf("Kuwait", "Jordan", "Sudan", "Palestine"), 1)
        )
    }
}