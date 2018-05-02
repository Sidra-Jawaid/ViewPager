package com.example.sidrajawaid.demoviewpager;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class tab2 extends Fragment {
    RecyclerView recyclerView;
    private OnFragmentInteractionListener mListener;

    public tab2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_tab2, container, false);
        recyclerView=view.findViewById(R.id.recyclerview);
        final GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);

        final ArrayList<ModelClass> modelClassArrayList=new ArrayList<>();
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item5));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item6));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item7));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item8));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        final RecyclerViewClass adapter = new RecyclerViewClass(modelClassArrayList, getContext(), new setOnItemClick() {
            @Override
            public void onItemClick(final int position, View v) {
                DialogFragmentClass dialogFragmentClass=DialogFragmentClass.newInstance();
                dialogFragmentClass.show(getActivity().getFragmentManager(),null);
                /*FragmentManager fm = getFragmentManager();
                DialogFragmentClass dialogFragment = new DialogFragmentClass();
                dialogFragment.show(fm,"Sample tag");*/
                /*AlertDialog.Builder ab=new AlertDialog.Builder(getContext());
                final String[] arraylist={"discount 1","discount 2","discount3","discount 1","discount 2","discount3","discount 1","discount 2","discount3","discount 1","discount 2","discount3"};
                        ab.setTitle("Sample View Pager")
                        .setIcon(R.drawable.alerticon)
                        .setItems(arraylist, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(),"You clicked "+arraylist[which],Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setCancelable(true).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                        public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(),"Item # "+(position+1),Toast.LENGTH_SHORT).show();
                            }
                        });
                ab.show();*/

            }
        });
        RecyclerView.ItemDecoration itemDecoration=new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if(adapter.getItemViewType(position)==ModelClass.TILE ){
                    return 1;
                }
                else {
                    return 2;
                }
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
