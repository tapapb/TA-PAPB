package com.studio.vokasi.tudhkar.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.studio.vokasi.tudhkar.R;
import com.studio.vokasi.tudhkar.model.ItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukman on 14/05/2017.
 */

public class ItemAdapter extends ArrayAdapter<ItemData> {
	private final Context context;
	private final ArrayList<ItemData> values;

	public ItemAdapter(Context context, ArrayList<ItemData> values) {
		super(context, R.layout.item_row, (List<ItemData>) values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.item_row, parent,false);
		TextView title = (TextView)view.findViewById(R.id.titelKategori);
		ImageView imageKategori = (ImageView)view.findViewById(R.id.imageKategori);

		title.setText(values.get(position).title);
		imageKategori.setImageResource(R.drawable.dzikir);

		switch (position){
			case 0:
				imageKategori.setImageResource(R.drawable.ic_favorite_black_24dp);
				break;
			case 1:
				imageKategori.setImageResource(R.drawable.ic_chrome_reader_mode_black_24dp);
				break;
			case 2:
				imageKategori.setImageResource(R.drawable.ic_check_black_24dp);
				break;
			case 3:
				imageKategori.setImageResource(R.drawable.ic_favorite_black_24dp);
				break;
			case 4:
				imageKategori.setImageResource(R.drawable.ic_chrome_reader_mode_black_24dp);
				break;
			case 5:
				imageKategori.setImageResource(R.drawable.ic_check_black_24dp);
				break;
			case 6:
				imageKategori.setImageResource(R.drawable.ic_favorite_black_24dp);
				break;
			case 7:
				imageKategori.setImageResource(R.drawable.ic_chrome_reader_mode_black_24dp);
				break;
			case 8:
				imageKategori.setImageResource(R.drawable.ic_check_black_24dp);
				break;
		}

		return view;
	}
}
