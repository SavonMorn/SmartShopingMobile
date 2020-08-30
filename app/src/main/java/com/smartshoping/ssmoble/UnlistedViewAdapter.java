package com.smartshoping.ssmoble;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a
 * TODO: Replace the implementation with code for your data type.
 */
public class UnlistedViewAdapter extends RecyclerView.Adapter<UnlistedViewAdapter.ViewHolder> {

    private final List<DummyItems.DummyObject> mValues;

    public UnlistedViewAdapter(List<DummyItems.DummyObject> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_unlisted_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mNameView.setText(mValues.get(position).Name);
        holder.mBrandView.setText(mValues.get(position).Brand);
        holder.mStoreView.setText(mValues.get(position).Store);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mBrandView;
        public final TextView mStoreView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.item_name);
            mBrandView = (TextView) view.findViewById(R.id.item_brand);
            mStoreView = (TextView) view.findViewById(R.id.item_store);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'" + mBrandView.getText() + "'";
        }
    }
}