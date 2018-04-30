package basicsolutionsoftware.com.kotlinexampleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButtonActions();
    }

    fun setButtonActions(){
        launch_form_btn.setOnClickListener { launchForm() }
        launch_dialog_btn.setOnClickListener { launchDialog() }
        launch_recycler_btn.setOnClickListener { launchRecycler() }
        launch_toast_btn.setOnClickListener { launchToast() }
    }

    fun launchForm(){
        val intentForm = FormActivity.newIntent(this);
        startActivity(intentForm)
    }

    fun launchDialog(){

    }

    fun launchRecycler(){

    }

    fun launchToast(){

    }

}
