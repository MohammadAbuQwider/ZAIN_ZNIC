package com.example.andriod.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/*
 * This app displays an order form to order coffee.
 **/
public class MainActivity extends ActionBarActivity {
  public static int quantity ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {


        display(2);
        displayPrice(5 * 2);


    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        //System.out.print("Total");
        quantityTextView.setText("" + number);

    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void Increment(View view) {
        quantity = 0;
        quantity=quantity+3;

        display(quantity);

    }

    public void decrement(View view) {
        quantity =0;
        quantity=quantity+1;
        display(quantity);
    }

}