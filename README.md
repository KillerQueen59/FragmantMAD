# Fragment pada android studio

Fragment merupakan *child* dari activity, dimana kalian para developers dapat membuat aplikasi lebih ringan dan lebih terstruktur

## Langkah-langkah

1. Pastikan anda sudah memiliki activity, karena fragment yang tadi disebut *child* pastinya harus memiliki *parent*.

2. Dalam activity tersebut, buatlah frame layout untuk menjadi wadah dimana framgent kalian akan berada.


```xml
<FrameLayout
        android:background="@color/colorPrimary"
        android:id="@+id/frameFragment"
        android:layout_width="match_parent"
        android:layout_height="500dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />
 ```
