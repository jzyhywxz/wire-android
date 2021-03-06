/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.core.stores.stub;

import android.content.Context;
import com.waz.api.ConnectionIndicator;
import com.waz.api.Contacts;
import com.waz.api.ConversationsList;
import com.waz.api.ErrorsList;
import com.waz.api.Giphy;
import com.waz.api.InitListener;
import com.waz.api.Invitations;
import com.waz.api.PermissionProvider;
import com.waz.api.Self;
import com.waz.api.User;
import com.waz.api.Usernames;
import com.waz.api.ZMessagingApi;
import com.waz.zclient.core.stores.api.IZMessagingApiStore;
import com.waz.zclient.core.stores.api.ZMessagingApiStoreObserver;

/**
 * This class is being done manually for now so that the test Activity can finish without causing an NPE. Generating
 * code for it is a bit too complicated to be worth it, especially just for this one exception
 */
public class StubZMessagingApiStore implements IZMessagingApiStore {
    @Override
    public void addApiObserver(ZMessagingApiStoreObserver observer) {

    }

    @Override
    public void removeApiObserver(ZMessagingApiStoreObserver observer) {

    }

    @Override
    public boolean isInitialized() {
        return false;
    }

    @Override
    public ZMessagingApi getApi() {
        return new ZMessagingApi() {
            @Override
            public void onCreate(Context context) {

            }

            @Override
            public void onResume() {

            }

            @Override
            public void onPause() {

            }

            @Override
            public void onDestroy() {

            }

            @Override
            public void onInit(InitListener initListener) {

            }

            @Override
            public void setPermissionProvider(PermissionProvider p) {

            }

            @Override
            public void removePermissionProvider(PermissionProvider p) {

            }

            @Override
            public void logout() {

            }

            @Override
            public Self getSelf() {
                return null;
            }

            @Override
            public ConversationsList getConversations() {
                return null;
            }

            @Override
            public User getUser(String s) {
                return null;
            }

            @Override
            public Contacts getContacts() {
                return null;
            }

            @Override
            public Invitations getInvitations() {
                return null;
            }

            @Override
            public ErrorsList getErrors() {
                return null;
            }

            @Override
            public Giphy getGiphy() {
                return null;
            }

            @Override
            public ConnectionIndicator getConnectionIndicator() {
                return null;
            }

            @Override
            public Usernames getUsernames() {
                return null;
            }
        };
    }

    @Override
    public void logout() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void tearDown() {
    }
}
