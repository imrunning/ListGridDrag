/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.collosteam.ListAndGridViewDragAnimationsDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.collosteam.ListAndGridViewDragAnimations.grid_list_drag.DynamicListView;
import com.collosteam.ListAndGridViewDragAnimations.grid_list_drag.StableArrayAdapter;

import java.util.ArrayList;

/**
 * This application creates a listview where the ordering of the data set
 * can be modified in response to user touch events.
 *
 * An item in the listview is selected via a long press event and is then
 * moved around by tracking and following the movement of the user's finger.
 * When the item is released, it animates to its new position within the listview.
 */
public class ListViewDraggingAnimationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<String>mCheeseList = new ArrayList<String>();
        for (int i = 0; i < Cheeses.sCheeseStrings.length; ++i) {
            mCheeseList.add(Cheeses.sCheeseStrings[i]);
        }

        StableArrayAdapter adapter = new StableArrayAdapter(this, R.layout.item_drag_list_view, mCheeseList);
        DynamicListView listView = (DynamicListView) findViewById(R.id.listview);

        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }
}
