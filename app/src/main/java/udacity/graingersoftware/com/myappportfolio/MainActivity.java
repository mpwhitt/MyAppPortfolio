package udacity.graingersoftware.com.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{

    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        mButtonOne = (Button)findViewById(R.id.buttonOne);
        mButtonOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_one_text), Toast.LENGTH_LONG).show();
            }
        });

        mButtonTwo = (Button)findViewById(R.id.buttonTwo);
        mButtonTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_two_text), Toast.LENGTH_LONG).show();
            }
        });

        mButtonThree = (Button)findViewById(R.id.buttonThree);
        mButtonThree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_three_text), Toast.LENGTH_LONG).show();
            }
        });

        mButtonFour = (Button)findViewById(R.id.buttonFour);
        mButtonFour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_four_text), Toast.LENGTH_LONG).show();
            }
        });

        mButtonFive = (Button)findViewById(R.id.buttonFive);
        mButtonFive.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_five_text), Toast.LENGTH_LONG).show();
            }
        });

        mButtonSix = (Button)findViewById(R.id.buttonSix);
        mButtonSix.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                Toast.makeText(mContext, getResources().getString(R.string.button_six_text), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
