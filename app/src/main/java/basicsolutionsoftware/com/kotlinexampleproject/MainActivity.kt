package basicsolutionsoftware.com.kotlinexampleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.toast

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
        alert {
            customView(
                    layoutInflater.inflate(R.layout.custom_dialog_anko, null)
            )
            yesButton { dismiss() }
        }.show()
    }

    fun launchRecycler(){
        startActivity(intentFor<RecyclerViewActivity>().singleTop())
    }

    fun launchToast(){
        toast(R.string.toas_anko)
    }

}
