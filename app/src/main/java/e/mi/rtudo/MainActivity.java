package e.mi.rtudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> lvAdapter;
    ArrayList<String> items;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItems = (ListView)findViewById(R.id.lvItems);
        items = new ArrayList<>();
        lvAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        lvItems.setAdapter(lvAdapter);
        items.add("First step");
        items.add("Second step");
    }

    public void onAddItem(View view) {
        EditText etNewItem = (EditText)(findViewById(R.id.etNewItems));
        String str = etNewItem.getText().toString();
        lvAdapter.add(str);
        etNewItem.setText("");
    }
}
