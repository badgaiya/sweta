package com.example.activitylifecycle

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.activitylifecycle.databinding.RowListBinding
import com.rsdigitech.dreamnplay.utils.Utility
import kotlinx.android.synthetic.main.row_list.view.*

class ListDataAdapter(context: Context?, var users: List<DataListModelResponse.DataListModelResponseItem>) :
    RecyclerView.Adapter<ListDataAdapter.ViewHolder>() /*, Filterable*/ {

    lateinit var binding: RowListBinding
    lateinit var list: List<DataListModelResponse.DataListModelResponseItem>

    var context: Context


    init {
        this.context = context!!
        this.list = users
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val layoutInflator: LayoutInflater = LayoutInflater.from(p0!!.context)
        binding = DataBindingUtil.inflate(layoutInflator, R.layout.row_list, p0, false)



        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if (viewHolder != null) {
            viewHolder.bindItem(position)


            viewHolder.itemView.name.setText("" + list!!.get(position).brand)

            Utility.setImageViaGlide(
                R.drawable.ic_action_delete,
                list!!.get(position).api_featured_image,
                viewHolder.itemView.img,
                viewHolder.itemView.context
            )




//            viewHolder.itemView.setOnClickListener{
//
//                var intent = Intent(context, ViewProfileActivity::class.java)
//
//                intent.putExtra("user_detail_id",list.get(position).id)
//
//                Utility.startActivityWithLeftToRightAnimationContext(context,intent)
//
//            }



        }
    }


    override fun getItemCount(): Int {
        if (list != null && list!!.size > 0)
            return list!!.size
        return 0

    }




    class ViewHolder constructor(binding: RowListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(position: Int) {
        }
    }




}