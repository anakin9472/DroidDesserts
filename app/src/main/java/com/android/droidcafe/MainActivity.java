package com.android.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String mOrderMessage="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String msg)
    {
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    public void orderDonuts(View view)
    {
        displayToast(getString(R.string.donut_order_message));
        mOrderMessage = getString(R.string.donut_order_message);
    }

    public void orderIceCream(View view)
    {
        displayToast(getString(R.string.ice_cream_order_message));
        mOrderMessage = getString(R.string.ice_cream_order_message);
    }

    public void orderFroyo(View view)
    {
        displayToast(getString(R.string.froyo_order_message));
        mOrderMessage = getString(R.string.froyo_order_message);
    }

    public void onClick(View view)
    {
        if (mOrderMessage == "")
        {
            Toast.makeText(getApplicationContext(),"Please order!",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            intent.putExtra("yourOrder", mOrderMessage);
            startActivity(intent);
        }
    }
}