package thegenuinegourav.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        productList = new ArrayList<>();

        initAllProducts();

        adapter = new ProductAdapter(this, productList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    public void initAllProducts()
    {
        productList.add( new Product("Refrigerator","1RGDS346","Delivered"));
        productList.add( new Product("Air Conditioner","1908IUY41","Pending"));
        productList.add( new Product("Medium Size Bed","DSWD2306","Delivered"));
        productList.add( new Product("Table","89076DMNHG","Pending"));
        productList.add( new Product("Sofa Set","123456GHF","Delivered"));
        productList.add( new Product("Bath Tub","990POI78","Pending"));
        productList.add( new Product("Laptop","1RG234CD","Pending"));

    }
}
