package softepec.es.ejemplolistacompleja;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(@NonNull Context context, List<User> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.list_item_user,
                    parent,
                    false);
        }

        ImageView avatar = convertView.findViewById(R.id.iv_avatar);
        TextView name = convertView.findViewById(R.id.tv_name);
        TextView title = convertView.findViewById(R.id.tv_title);
        TextView company = convertView.findViewById(R.id.tv_company);

        User item = getItem(position);

        Glide.with(getContext()).load(item.getImage()).into(avatar);
        name.setText(item.getName());
        title.setText(item.getTitle());
        company.setText(item.getCompany());

        return convertView;
    }


}
