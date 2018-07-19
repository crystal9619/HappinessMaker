package com.example.happiness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.DatePicker;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.spans.DotSpan;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;


public class Fragment3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment3, container, false);

        MaterialCalendarView calendar = (MaterialCalendarView) rootView.findViewById(R.id.calendar);

        calendar.state().edit()
                .setFirstDayOfWeek(Calendar.SUNDAY)
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();


        calendar.addDecorators(new OneDayDecorator(),new a(),new b(),new c(),new d());
       // calendar.addDecorator(new wow);

        return rootView;
    }

    private class OneDayDecorator implements DayViewDecorator {

        private CalendarDay date;

        public OneDayDecorator() {

            date=CalendarDay.from(2018,1,6);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return date!=null&&day.equals(date);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(10,Color.rgb(60,203,251)));
        }

        public void setDate(Date date)
        {
            this.date=CalendarDay.from(date);
        }

    }

    private class a implements DayViewDecorator {

        private CalendarDay date;

        public a() {

            date=CalendarDay.from(2018,1,5);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return date!=null&&day.equals(date);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(10,Color.YELLOW));
        }

        public void setDate(Date date)
        {
            this.date=CalendarDay.from(date);
        }
    }

    private class b implements DayViewDecorator {

        private CalendarDay date;

        public b() {

            date=CalendarDay.from(2018,1,4);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return date!=null&&day.equals(date);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(10,Color.rgb(60,203,251)));
        }

        public void setDate(Date date)
        {
            this.date=CalendarDay.from(date);
        }
    }

    private class c implements DayViewDecorator {

        private CalendarDay date;

        public c() {

            date=CalendarDay.from(2018,1,3);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return date!=null&&day.equals(date);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(10,Color.rgb(0,0,0)));
        }

        public void setDate(Date date)
        {
            this.date=CalendarDay.from(date);
        }
    }

    private class d implements DayViewDecorator {

        private CalendarDay date;

        public d() {

            date=CalendarDay.from(2018,1,2);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return date!=null&&day.equals(date);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(10,Color.GRAY));
        }

        public void setDate(Date date)
        {
            this.date=CalendarDay.from(date);
        }
    }






}
