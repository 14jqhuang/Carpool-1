package com.example.sheng.carpool.ListViewHelp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sheng.carpool.Dao.CarpoolInfo;
import com.example.sheng.carpool.Dao.MyInfo;
import com.example.sheng.carpool.R;

import java.util.List;

/**
 * Created by sheng on 16-12-7.
 */
public class PeopleInfoListAdapter extends ArrayAdapter<MyInfo> {
    private int resourceId;
    private Context context;
    private TextView case_in_name;
    private TextView case_in_phone;
    private String str_case_in_name,str_case_in_phone;
    public PeopleInfoListAdapter(Context context, int textViewRescourceId,
                                 List<MyInfo> objects){
        super(context,textViewRescourceId,objects);
        resourceId = textViewRescourceId;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        MyInfo myInfo = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        componentInit(view);
        case_in_name.setText(myInfo.getName());
        case_in_phone.setText(myInfo.getPhone());
        return view;
    }
    private void componentInit(View view){
        case_in_name = (TextView)view.findViewById(R.id.case_in_name);
        case_in_phone = (TextView)view.findViewById(R.id.case_in_phone);
    }
    private void getVaule(){
        str_case_in_name = case_in_name.getText().toString();
        str_case_in_phone = case_in_phone.getText().toString();
    }
}
