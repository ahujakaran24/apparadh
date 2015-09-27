package gcfi.apparadh.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gcfi.apparadh.R;

/**
 * by Jupneet
 * Adapter for the list in navigation drawer
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.CustomViewHolder> {

    private Context mContext;
    ArrayList<String> listItems;

    public MyRecyclerAdapter(Context context,List<String> listOfStrings) {
        listItems = (ArrayList<String>)listOfStrings;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, null);

        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int position) {

        //Setting text view title
        customViewHolder.textView.setText(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return (null != listItems ? listItems.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;

        public CustomViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.title);
        }
    }
}