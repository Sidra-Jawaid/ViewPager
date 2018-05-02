package com.example.sidrajawaid.demoviewpager;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DialogFragmentClass extends DialogFragment {
    ListView listview;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.dialoglayout,container,false);
        getDialog().setTitle("Available Discounts");
        getDialog().setCancelable(true);
        getDialog().requestWindowFeature(Window.FEATURE_LEFT_ICON);
        getDialog().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.alerticon);
        listview=rootview.findViewById(R.id.dialoglistview);
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("Discount 1");
        arrayList.add("Discount 2");
        arrayList.add("Discount 3");
        arrayList.add("Discount 4");
        arrayList.add("Discount 5");
        arrayList.add("Discount 6");
        arrayList.add("Discount 7");
        arrayList.add("Discount 8");
        arrayList.add("Discount 9");
        arrayList.add("Discount 10");
        arrayList.add("Discount 11");
        arrayList.add("Discount 12");
        arrayList.add("Discount 13");
        arrayList.add("Discount 14");
        arrayList.add("Discount 15");
        arrayList.add("Discount 16");
        arrayList.add("Discount 17");
        arrayList.add("Discount 18");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arrayList);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"You clicked "+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
            }
        });
        return rootview;
    }
    public static DialogFragmentClass newInstance() {
        DialogFragmentClass dialogFragment_Class = new DialogFragmentClass();
        return dialogFragment_Class;
    }

}
