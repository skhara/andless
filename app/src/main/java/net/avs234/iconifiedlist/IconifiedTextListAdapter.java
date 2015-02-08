package net.avs234.iconifiedlist;

import java.util.ArrayList;
import java.util.List;
import net.avs234.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/** @author Steven Osborn - http://steven.bitsetters.com */
public class IconifiedTextListAdapter extends BaseAdapter {
	
		LayoutInflater factory; 
		View newView;
		
		TextView txtView;
		ImageView imgView;
		
        /** Remember our context so we can use it when constructing views. */
        private Context mContext;

        private List<IconifiedText> mItems = new ArrayList<IconifiedText>();

        public IconifiedTextListAdapter(Context context) {
                mContext = context;
                factory = LayoutInflater.from(context);
                
        }

        public void addItem(IconifiedText it) { mItems.add(it); }

        public void setListItems(List<IconifiedText> lit) { mItems = lit; }

        /** @return The number of items in the */
        public int getCount() { return mItems.size(); }

        public Object getItem(int position) { return mItems.get(position); }

        public boolean areAllItemsSelectable() { return false; }

        public boolean isSelectable(int position) {
                return mItems.get(position).isSelectable();
        }

        /** Use the array index as a unique id. */
        public long getItemId(int position) {
                return position;
        }

	private boolean mNightMode = false;
	public void setNightMode(boolean nm) {
		mNightMode = nm;
	}
       
        /** @param convertView The old view to overwrite, if one is passed
         * @returns a IconifiedTextView that holds wraps around an IconifiedText */
        public View getView(int position, View convertView, ViewGroup parent) {
        	if(convertView == null) {
			newView = factory.inflate(R.layout.row, null);
		} else {
			newView = convertView;
		}
            txtView = (TextView)newView.findViewById(R.id.title);
            txtView.setText(mItems.get(position).getText());
            imgView = (ImageView)newView.findViewById(R.id.icon);
            imgView.setImageDrawable(mItems.get(position).getIcon());
		
		if (mNightMode == false) {
			ColorStateList d = mContext.getResources().getColorStateList(R.drawable.selector);
			txtView.setTextColor(d);
			newView.setBackgroundColor(Color.WHITE);
			
		} else {
			ColorStateList d = mContext.getResources().getColorStateList(R.drawable.selector_night);
			txtView.setTextColor(d);
			newView.setBackgroundColor(Color.BLACK);
		}

		return newView;
	}
}
