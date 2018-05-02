package basicsolutionsoftware.com.kotlinexampleproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import basicsolutionsoftware.com.kotlinexampleproject.adapters.PersonAdapter
import basicsolutionsoftware.com.kotlinexampleproject.bean.Person
import kotlinx.android.synthetic.main.activity_recycler_view.*
import org.jetbrains.anko.toast

class RecyclerViewActivity : AppCompatActivity(){

    var names:ArrayList<Person> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        setButtonActions()
        initRecyclerView()
    }

    fun setButtonActions(){
        add_btn.setOnClickListener { getItemText() }
    }

    fun getItemText(){
        var completeNameString = name_et.getText().toString()
        if(!completeNameString.isEmpty()){
            addItem(completeNameString)
        } else {
            toast(R.string.error_fill_name)
        }
    }

    fun addItem(completeName:String){
        names.add(Person(completeName, 0))
        names_rv.adapter.notifyDataSetChanged()
    }

    fun initRecyclerView(){
        names_rv.layoutManager = LinearLayoutManager(this)
        names_rv.adapter = PersonAdapter(names, this)
    }

}