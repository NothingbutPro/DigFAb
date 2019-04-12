package com.ics.newapp.fregment;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ics.newapp.R;

public class BuyerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buyer, container, false);
        return view;
//        return inflater.inflate(R.layout.manufacure, container, false);

    }

//    @Override
//    public void onPrepareOptionsMenu(Menu menu) {
//        MenuItem item=menu.findItem(R.id.card_shopping);
//        item.setVisible(true);
//
////            item2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
////                @Override
////                public boolean onMenuItemClick(MenuItem item) {
////                    Fragment view_creat=new Create_Activity();
////                    FragmentManager fragmentManager = getFragmentManager();
////                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////                    fragmentTransaction.replace(R.id.content_frame,view_creat);
////                    fragmentTransaction.addToBackStack(null);
////                    fragmentTransaction.commit();
////
////
////                    return false;
////                }
////            });
//
//
//    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       // setHasOptionsMenu(true);




        int[] images = new int[]{R.drawable.dd5, R.drawable.dd2, R.drawable.dd2,R.drawable.dd4};
        LinearLayout sv = (LinearLayout) view.findViewById (R.id.linear);
        for (int i=0 ; i<3; i++){
            ImageView iv = new ImageView (view.getContext());
            iv.setBackgroundResource (images[i]);
            iv.setPadding(2, 2, 2, 2);
            iv.setMinimumWidth(8);
            sv.addView(iv);
        }
    }
}
