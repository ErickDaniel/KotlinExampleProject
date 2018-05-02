package basicsolutionsoftware.com.kotlinexampleproject

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form.*
import org.jetbrains.anko.toast

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        addButtonActions();
    }

    fun addButtonActions(){
        accept.setOnClickListener{validateInputs()}
    }

    fun validateInputs(){
        var name = name_et.getText().toString();
        var age = age_et.getText().toString()

        if(name.isEmpty()){
            toast(R.string.error_fill_name)
           return;
        }

        if(age_et.getText().isEmpty()){
            toast(R.string.error_fill_age)
            return
        }

        var stringBuilder = StringBuilder()

        stringBuilder.append(getString(R.string.hi_) + name + getString(R.string.you_are_))

        if(age.toInt() > 18){
            stringBuilder.append(getString(R.string.adult))
        } else {
            stringBuilder.append(getString(R.string.child))
        }

        toast(stringBuilder.toString())
        finish()
    }

    companion object {
        fun newIntent(context: Context):Intent{
            val intent = Intent(context, FormActivity::class.java)
            return intent;
        }
    }

}