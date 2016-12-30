package thegenuinegourav.recyclercardview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private Context mContext;
    private List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList)
    {
        this.mContext = context;
        this.productList = productList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_cardview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Product product = productList.get(position);
        holder.title.setText(product.getName());
        if(product.getStatus().equals("Pending")) holder.status.setTextColor(Color.RED);
        else holder.status.setTextColor(Color.GREEN);
        holder.status.setText(product.getStatus());
        holder.product_id.setText(product.getProduct_id());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, status, product_id;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            product_id = (TextView) view.findViewById(R.id.id);
            status = (TextView) view.findViewById(R.id.status);

        }
    }
}
