package br.com.moreOrLess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import br.com.contador.R;

public class MainActivity extends AppCompatActivity {

    private Integer number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Method to add plus a number
     * @param viewAdd
     */
    public void moreOne(View viewAdd) {
        TextView tViewAdd = (TextView) findViewById(R.id.show);

        this.number++;

        tViewAdd.setText(number.toString());
    }

    /**
     * Method to diminish a number
     * @param viewLess
     */
    public void lessOne(View viewLess) {
        TextView tViewLess = (TextView) findViewById(R.id.show);

        this.number--;

        tViewLess.setText(number.toString());
    }

    /**
     * Method to clean all the numbers
     * @param viewClean
     */
    public void cleanAll(View viewClean) {
        TextView tViewClean = (TextView) findViewById(R.id.show);

        this.number = 0;

        tViewClean.setText(number.toString());
    }
}
