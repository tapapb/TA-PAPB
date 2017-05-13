package com.studio.vokasi.tudhkar.composer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.studio.vokasi.tudhkar.R;
import com.studio.vokasi.tudhkar.model.ItemData;
import com.studio.vokasi.tudhkar.view.ItemAdapter;
import com.twotoasters.jazzylistview.JazzyHelper;
import com.twotoasters.jazzylistview.JazzyListView;

import java.util.ArrayList;

public class ListKategori extends AppCompatActivity {

	String[] values;
	JazzyListView listKategori;
	ArrayList<ItemData> listItem;
	ItemAdapter itemAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_bar_list_kategori);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarKategori);
		setSupportActionBar(toolbar);

		Intent i = getIntent();
		String output = i.getStringExtra("kategori");

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle(output);

		values = new String[] {"Politik", "Bisnis", "Teknologi", "Bisnis","Politik", "Teknologi", "Bisnis", "Teknologi", "Bisnis"};
		listKategori = (JazzyListView)findViewById(R.id.listKategori);
		listKategori.setTransitionEffect(JazzyHelper.GROW);
		listItem = new ArrayList<ItemData>();

		ItemData itemData1 = new ItemData();
		itemData1.title = "Politik";
		itemData1.itemId = 0;

		ItemData itemData2 = new ItemData();
		itemData2.title = "Bisnis";
		itemData2.itemId = 1;

		ItemData itemData3 = new ItemData();
		itemData3.title = "Teknologi";
		itemData3.itemId = 2;

		ItemData itemData4 = new ItemData();
		itemData1.title = "Bisnis";
		itemData1.itemId = 3;

		ItemData itemData5 = new ItemData();
		itemData2.title = "Politik";
		itemData2.itemId = 4;

		ItemData itemData6 = new ItemData();
		itemData3.title = "Teknologi";
		itemData3.itemId = 5;

		ItemData itemData7 = new ItemData();
		itemData1.title = "Bisnis";
		itemData1.itemId = 6;

		ItemData itemData8 = new ItemData();
		itemData2.title = "Teknologi";
		itemData2.itemId = 7;

		ItemData itemData9 = new ItemData();
		itemData3.title = "Bisnis";
		itemData3.itemId = 8;

		listItem.add(itemData1);
		listItem.add(itemData2);
		listItem.add(itemData3);
		listItem.add(itemData4);
		listItem.add(itemData5);
		listItem.add(itemData6);
		listItem.add(itemData7);
		listItem.add(itemData8);
		listItem.add(itemData9);

		itemAdapter = new ItemAdapter(this, listItem);
		listKategori.setAdapter(itemAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_cari, menu);
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
			finishAffinity();
		}

		return super.onOptionsItemSelected(item);
	}
}
