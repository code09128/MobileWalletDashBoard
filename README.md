# MobileWalletDashBoard
Design MobileWalletDashBoard UI demo

<!-- ![Screenshot_1686973045](https://github.com/code09128/MobileWalletDashBoard/assets/32324308/3b2b31bb-11d7-4e29-b2d4-93e8b9ad1c86) -->
<div  align="center"> 
<img src="https://github.com/code09128/MobileWalletDashBoard/assets/32324308/3b2b31bb-11d7-4e29-b2d4-93e8b9ad1c86" width="350px"/>
</div>

# MainPage
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/purple"
    tools:context=".view.MainActivity" >

    <ScrollView
        android:id="@+id/scrollView2"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <ImageView
                    android:id="@+id/imageView"
                    android:layout_width="70dp"
                    android:layout_height="70dp"
                    android:layout_marginTop="32dp"
                    android:layout_marginEnd="32dp"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintTop_toTopOf="parent"
                    app:srcCompat="@drawable/icon" />

                <TextView
                    android:id="@+id/textView"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="32dp"
                    android:text="Hello, Dustin"
                    android:textColor="@color/white"
                    android:textSize="20sp"
                    android:textStyle="bold"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="@+id/imageView" />
            </androidx.constraintlayout.widget.ConstraintLayout>

            <TextView
                android:id="@+id/textView2"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Total Balance"
                android:textAlignment="center"
                android:textColor="@color/white"
                android:textSize="19sp" />

            <TextView
                android:id="@+id/textView3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="$85,544.12"
                android:textAlignment="center"
                android:textColor="@color/white"
                android:textSize="37sp"
                android:textStyle="bold" />

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <LinearLayout
                    android:id="@+id/linearLayout"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="100dp"
                    android:background="@drawable/white_background"
                    android:orientation="vertical"
                    android:paddingBottom="100dp"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="32dp"
                        android:layout_marginTop="124dp"
                        android:layout_marginEnd="32dp"
                        android:orientation="horizontal">

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="0.25">

                            <View
                                android:id="@+id/vSend"
                                android:layout_width="64dp"
                                android:layout_height="64dp"
                                android:background="@drawable/background_button_1"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent" />

                            <ImageView
                                android:id="@+id/ivSend"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="@+id/vSend"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/send" />

                            <TextView
                                android:id="@+id/tvSend"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Send"
                                android:textColor="@color/purple"
                                android:textSize="14sp"
                                android:textStyle="bold"
                                app:layout_constraintEnd_toEndOf="@id/vSend"
                                app:layout_constraintStart_toStartOf="@id/vSend"
                                app:layout_constraintTop_toBottomOf="@+id/vSend" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="0.25">

                            <View
                                android:id="@+id/vRecieve"
                                android:layout_width="64dp"
                                android:layout_height="64dp"
                                android:background="@drawable/background_button_2"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent" />

                            <ImageView
                                android:id="@+id/ivRecieve"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="@+id/vRecieve"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/recieve" />

                            <TextView
                                android:id="@+id/tvRecieve"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Recieve"
                                android:textColor="@color/purple"
                                android:textSize="14sp"
                                android:textStyle="bold"
                                app:layout_constraintEnd_toEndOf="@id/vRecieve"
                                app:layout_constraintStart_toStartOf="@id/vRecieve"
                                app:layout_constraintTop_toBottomOf="@+id/vRecieve" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="0.25">

                            <View
                                android:id="@+id/vBuy"
                                android:layout_width="64dp"
                                android:layout_height="64dp"
                                android:background="@drawable/background_button_1"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent" />

                            <ImageView
                                android:id="@+id/ivBuy"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="@+id/vBuy"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/buy" />

                            <TextView
                                android:id="@+id/tvBuy"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Buy"
                                android:textColor="@color/purple"
                                android:textSize="14sp"
                                android:textStyle="bold"
                                app:layout_constraintEnd_toEndOf="@id/vBuy"
                                app:layout_constraintStart_toStartOf="@id/vBuy"
                                app:layout_constraintTop_toBottomOf="@+id/vBuy" />
                        </androidx.constraintlayout.widget.ConstraintLayout>

                        <androidx.constraintlayout.widget.ConstraintLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="0.25">

                            <View
                                android:id="@+id/vAdd"
                                android:layout_width="64dp"
                                android:layout_height="64dp"
                                android:background="@drawable/background_button_2"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent" />

                            <ImageView
                                android:id="@+id/ivAdd"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                app:layout_constraintBottom_toBottomOf="@+id/vAdd"
                                app:layout_constraintEnd_toEndOf="parent"
                                app:layout_constraintStart_toStartOf="parent"
                                app:layout_constraintTop_toTopOf="parent"
                                app:srcCompat="@drawable/add" />

                            <TextView
                                android:id="@+id/tvAdd"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Add"
                                android:textColor="@color/purple"
                                android:textSize="14sp"
                                android:textStyle="bold"
                                app:layout_constraintEnd_toEndOf="@id/vAdd"
                                app:layout_constraintStart_toStartOf="@id/vAdd"
                                app:layout_constraintTop_toBottomOf="@+id/vAdd" />
                        </androidx.constraintlayout.widget.ConstraintLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:orientation="horizontal">

                        <TextView
                            android:id="@+id/tvSendMoney"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="32dp"
                            android:layout_weight="1"
                            android:text="SEND MONEY"
                            android:textColor="@color/black"
                            android:textStyle="bold" />

                        <TextView
                            android:id="@+id/tvCONTACT"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="32dp"
                            android:layout_weight="1"
                            android:text="CONTACT LIST"
                            android:textAlignment="viewEnd"
                            android:textColor="#922cf7"
                            android:textStyle="bold" />
                    </LinearLayout>

                    <androidx.recyclerview.widget.RecyclerView
                        android:id="@+id/recyclerView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:clipToPadding="false"
                        android:paddingStart="24dp"
                        android:paddingEnd="24dp" />

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:orientation="horizontal">

                        <TextView
                            android:id="@+id/tvTRANSECTION"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="32dp"
                            android:layout_weight="1"
                            android:text="TRANSECTION HISTORY"
                            android:textColor="@color/black"
                            android:textStyle="bold" />

                        <TextView
                            android:id="@+id/tvSEEALL"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="32dp"
                            android:layout_weight="1"
                            android:text="SEE ALL"
                            android:textAlignment="viewEnd"
                            android:textColor="#922cf7"
                            android:textStyle="bold" />
                    </LinearLayout>

                    <androidx.constraintlayout.widget.ConstraintLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="32dp"
                        android:layout_marginTop="16dp"
                        android:layout_marginEnd="32dp">

                        <View
                            android:id="@+id/vItem"
                            android:layout_width="64dp"
                            android:layout_height="64dp"
                            android:background="@drawable/history_background"
                            app:layout_constraintBottom_toBottomOf="parent"
                            app:layout_constraintStart_toStartOf="parent"
                            app:layout_constraintTop_toTopOf="parent" />

                        <ImageView
                            android:id="@+id/ivItem"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:src="@drawable/pizza"
                            app:layout_constraintBottom_toBottomOf="@id/vItem"
                            app:layout_constraintEnd_toEndOf="@id/vItem"
                            app:layout_constraintStart_toStartOf="@id/vItem"
                            app:layout_constraintTop_toTopOf="@id/vItem">
                        </ImageView>

                        <TextView
                            android:id="@+id/textView12"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="16dp"
                            android:layout_marginTop="8dp"
                            android:text="Buy Pizza"
                            android:textColor="@color/black"
                            android:textSize="15sp"
                            android:textStyle="bold"
                            app:layout_constraintStart_toEndOf="@+id/vItem"
                            app:layout_constraintTop_toTopOf="@+id/vItem" />

                        <TextView
                            android:id="@+id/textView13"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="Payment from card **4588"
                            android:textSize="13sp"
                            android:textStyle="bold"
                            app:layout_constraintBottom_toBottomOf="@id/vItem"
                            app:layout_constraintStart_toStartOf="@id/textView12"
                            app:layout_constraintTop_toBottomOf="@id/textView12" />

                        <TextView
                            android:id="@+id/textView14"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="-$30.22"
                            android:textColor="@color/black"
                            android:textSize="16sp"
                            android:textStyle="bold"
                            app:layout_constraintBottom_toBottomOf="parent"
                            app:layout_constraintEnd_toEndOf="parent"
                            app:layout_constraintTop_toTopOf="parent" />

                    </androidx.constraintlayout.widget.ConstraintLayout>
                </LinearLayout>

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:layout_marginStart="32dp"
                    android:layout_marginEnd="32dp"
                    android:background="@drawable/card_background"
                    app:layout_constraintBottom_toTopOf="@+id/linearLayout"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="@+id/linearLayout">

                    <ImageView
                        android:id="@+id/imageView2"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="32dp"
                        android:layout_marginTop="32dp"
                        app:layout_constraintStart_toStartOf="parent"
                        app:layout_constraintTop_toTopOf="parent"
                        app:srcCompat="@drawable/mastercard" />

                    <ImageView
                        android:id="@+id/imageView3"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginEnd="32dp"
                        app:layout_constraintBottom_toBottomOf="@+id/imageView2"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintTop_toTopOf="@+id/imageView2"
                        app:srcCompat="@drawable/sim" />

                    <TextView
                        android:id="@+id/textView4"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:text="5245 5638 1098 4588"
                        android:textColor="@color/white"
                        android:textSize="28sp"
                        app:layout_constraintEnd_toEndOf="@+id/imageView3"
                        app:layout_constraintStart_toStartOf="@+id/imageView2"
                        app:layout_constraintTop_toBottomOf="@+id/imageView3" />

                    <TextView
                        android:id="@+id/textView5"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:text="name"
                        android:textColor="#c4c4c4"
                        android:textSize="12sp"
                        app:layout_constraintStart_toStartOf="@+id/textView4"
                        app:layout_constraintTop_toBottomOf="@+id/textView4" />

                    <TextView
                        android:id="@+id/textView6"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Dustin Hsieh"
                        android:textColor="@color/white"
                        android:textSize="12sp"
                        app:layout_constraintStart_toStartOf="@+id/textView5"
                        app:layout_constraintTop_toBottomOf="@+id/textView5" />

                    <TextView
                        android:id="@+id/textView7"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Exp.date"
                        android:textColor="#c4c4c4"
                        android:textSize="12sp"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintStart_toEndOf="@+id/textView6"
                        app:layout_constraintTop_toTopOf="@+id/textView5" />

                    <TextView
                        android:id="@+id/textView8"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="33/12"
                        android:textColor="@color/white"
                        android:textSize="12sp"
                        app:layout_constraintStart_toStartOf="@+id/textView7"
                        app:layout_constraintTop_toBottomOf="@+id/textView7" />


                </androidx.constraintlayout.widget.ConstraintLayout>

            </androidx.constraintlayout.widget.ConstraintLayout>
        </LinearLayout>
    </ScrollView>

    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="100dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <com.google.android.material.bottomappbar.BottomAppBar
            android:id="@+id/app_bar"
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:layout_gravity="bottom"
            app:fabCradleMargin="8dp"
            app:fabCradleRoundedCornerRadius="50dp"
            app:fabCradleVerticalOffset="6dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="horizontal">

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        android:layout_gravity="center"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn1">
                    </ImageView>

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="Home"
                        android:textAlignment="center">
                    </TextView>
                </LinearLayout>

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        android:layout_gravity="center"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn2">
                    </ImageView>

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="Profile"
                        android:textAlignment="center">
                    </TextView>
                </LinearLayout>

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:orientation="vertical"
                    android:visibility="invisible"
                    tools:visibility="invisible">

                    <ImageView
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        android:layout_gravity="center"
                        android:layout_weight="1"
                        android:src="@drawable/bottom_btn1">
                    </ImageView>

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="Home"
                        android:textAlignment="center">
                    </TextView>
                </LinearLayout>

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        android:layout_gravity="center"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn3">
                    </ImageView>

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="Wallet"
                        android:textAlignment="center">
                    </TextView>
                </LinearLayout>

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="2"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="20dp"
                        android:layout_height="20dp"
                        android:layout_gravity="center"
                        android:layout_weight="1"
                        app:srcCompat="@drawable/bottom_btn4">
                    </ImageView>

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="Settings"
                        android:textAlignment="center">
                    </TextView>
                </LinearLayout>
            </LinearLayout>
        </com.google.android.material.bottomappbar.BottomAppBar>

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/float_icon"
            app:layout_anchor="@id/app_bar"
            android:backgroundTint="@color/green"
            app:maxImageSize="30dp"
            android:tint="@color/white">
        </com.google.android.material.floatingactionbutton.FloatingActionButton>
    </androidx.coordinatorlayout.widget.CoordinatorLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
```

## Card Style Background
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <corners android:radius="28dp"/>
            <gradient android:startColor="#359786" android:endColor="#040e4a"/>
            <stroke android:color="#828282" android:width="1dp"/>
        </shape>
    </item>
</selector>
```

## item background
```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <solid android:color="#FEE2CB"/>
        </shape>
    </item>
</selector>
```

## button 1
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <solid android:color="#3056BA"/>
        </shape>
    </item>
</selector>
```

## button 2
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <solid android:color="#3EA2CF"/>
        </shape>
    </item>
</selector>
```
