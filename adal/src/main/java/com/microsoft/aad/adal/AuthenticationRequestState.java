// Copyright (c) Microsoft Corporation.
// All rights reserved.
//
// This code is licensed under the MIT License.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files(the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions :
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package com.microsoft.aad.adal;

class AuthenticationRequestState {
    private int mRequestId = 0;

    private AuthenticationCallback<AuthenticationResult> mDelegate = null;

    private boolean mCancelled = false;

    private AuthenticationRequest mRequest = null;
    
    public AuthenticationRequestState(int requestCallbackId, AuthenticationRequest request,
            AuthenticationCallback<AuthenticationResult> delegate) {
        mRequestId = requestCallbackId;
        mDelegate = delegate;
        mRequest = request;
    }

    public int getRequestId() {
        return mRequestId;
    }

    public void setRequestId(int requestId) {
        mRequestId = requestId;
    }

    public AuthenticationCallback<AuthenticationResult> getDelegate() {
        return mDelegate;
    }

    public void setDelegate(AuthenticationCallback<AuthenticationResult> delegate) {
        mDelegate = delegate;
    }
    
    public boolean isCancelled() {
        return mCancelled;
    }

    public void setCancelled(boolean cancelled) {
        mCancelled = cancelled;
    }
    
    public AuthenticationRequest getRequest() {
        return mRequest;
    }

    public void setRequest(AuthenticationRequest request) {
        this.mRequest = request;
    }
}
