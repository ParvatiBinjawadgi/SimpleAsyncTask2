package com.example.dslab.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
    private final TextView mTextView;
    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }

    @Override
    protected String doInBackground(Void... voids)
    {
        Random r = new Random();
        int n = r.nextInt(11);

        int s = n * 200;

        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Awake at last after sleeping for " + s + " milliseconds!";
    }


    public SimpleAsyncTask(TextView tv) {
        mTextView = tv;

    }
}

