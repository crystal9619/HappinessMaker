package com.example.happiness;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class Fragment4 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment4, container, false);

        LineChart moodchart=(LineChart)rootView.findViewById(R.id.moodchart);
        LineChart sleepchart=(LineChart)rootView.findViewById(R.id.sleepchart);


        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(20, 0));
        entries.add(new Entry(30, 1));
        entries.add(new Entry(10, 2));
        entries.add(new Entry(50, 3));
        entries.add(new Entry(10, 4));

        ArrayList<Entry> sentries = new ArrayList<>();
        sentries.add(new Entry(7, 0));
        sentries.add(new Entry(12, 1));
        sentries.add(new Entry(13, 2));
        sentries.add(new Entry(2, 3));
        sentries.add(new Entry(5, 4));

        LineDataSet moodDataSet = new LineDataSet(entries," ");
        LineDataSet sleepDataSet = new LineDataSet(sentries," ");

        ArrayList<String> labels=new ArrayList<String>();
        labels.add("2일");
        labels.add("3일");
        labels.add("4일");
        labels.add("5일");
        labels.add("6일");



        XAxis xAxis = moodchart.getXAxis();
        XAxis sxAxis = sleepchart.getXAxis();

        sxAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        xAxis.setDrawGridLines(false);
        sxAxis.setDrawGridLines(false);

        YAxis rightAxis=moodchart.getAxisRight();
        YAxis srightAxis=sleepchart.getAxisRight();

        rightAxis.setEnabled(false);
        srightAxis.setEnabled(false);

        YAxis yAxis = moodchart.getAxisLeft();
        YAxis syAxis=sleepchart.getAxisLeft();

        yAxis.setAxisMaxValue(60);
        syAxis.setAxisMaxValue(23);

        yAxis.setAxisMinValue(0);
        syAxis.setAxisMinValue(0);

       yAxis.setEnabled(false);

        moodDataSet.setValueTextSize(0);


        LineData moodData = new LineData(labels,moodDataSet);
        LineData sleepData = new LineData(labels,sleepDataSet);

        moodchart.setData(moodData);
        sleepchart.setData(sleepData);

        moodchart.animateY(2000);
        sleepchart.animateY(2000);

        moodchart.setDescription("");
        sleepchart.setDescription("");

        moodchart.getLegend().setEnabled(false);
        sleepchart.getLegend().setEnabled(false);

        moodchart.invalidate();
        sleepchart.invalidate();

        return rootView;
    }
}
