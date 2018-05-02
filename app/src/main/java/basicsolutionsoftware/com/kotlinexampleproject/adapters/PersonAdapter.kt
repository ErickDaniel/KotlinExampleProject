package basicsolutionsoftware.com.kotlinexampleproject.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import basicsolutionsoftware.com.kotlinexampleproject.R
import basicsolutionsoftware.com.kotlinexampleproject.bean.Person
import kotlinx.android.synthetic.main.row_custom_person.view.*

class PersonAdapter(val items : ArrayList<Person>, val context:Context) : RecyclerView.Adapter<PersonAdapter.PersonHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        return PersonHolder(LayoutInflater.from(context).inflate(R.layout.row_custom_person, parent, false))
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder?.namePersonTV?.text = items.get(position).completeName
    }

    class PersonHolder (view: View) : RecyclerView.ViewHolder(view) {
        val imagePersonIV = view.ic_person
        val namePersonTV = view.name_tv
    }

}