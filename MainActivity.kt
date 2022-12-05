package com.dbs.quizapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.dbs.quizapplication.R
import com.dbs.quizapplication.activities.QuizQuestionActivity
import com.dbs.quizapplication.data.Constants


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart: Button = findViewById(R.id.btn_start)
        val etName: AppCompatEditText = findViewById(R.id.et_name)

        // TODO (STEP 3: Now validate name is entered or not and launch the QuizQuestion Activity.)
        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                // TODO Pass the name through intent using the constant variable which we have created.
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}