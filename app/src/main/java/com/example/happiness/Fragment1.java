package com.example.happiness;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        final ImageView avartar = (ImageView) rootView.findViewById(R.id.avartar);


        avartar.setOnTouchListener(new View.OnTouchListener() {

            float preX;
            float preY;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN :
                        preX=motionEvent.getRawX();
                        preY=motionEvent.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE :
                        avartar.setX(avartar.getX()+(motionEvent.getRawX()-preX));
                        avartar.setY(avartar.getY()+(motionEvent.getRawY()-preY));
                        preX=motionEvent.getRawX();
                        preY=motionEvent.getRawY();
                        break;
                    case MotionEvent.ACTION_UP   :
                        // 이미지 뷰의 위치를 옮기기
                }

                return true;
            }
        });


        return rootView;
    }


}
