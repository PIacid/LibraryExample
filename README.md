# LibraryExample: 
a library posting SNFW gifs into your app

example usage:

-create a provider<br />
val provider: PornProvider = PornProvider()

-get a fragment from the provider<br />
val frag = provider.getFragment(1000, 1260)

-include a gragment in your layout<br />
supportFragmentManager.beginTransaction().add(R.id.layoutId, frag).commit()

gradle config: 
<br />
<br />
allprojects { <br />
repositories { <br />
... <br />
maven { url 'https://jitpack.io' } <br />
} <br />
} <br /><br />
dependencies { <br />
	implementation 'com.github.PIacid:LibraryExample:1.1' <br />
} 

-requires:<br />
    <uses-permission android:name="android.permission.INTERNET"/>
