# LibraryExample: 
a library posting NSFW gifs into your app or opening an Activity with Wikipedia main page

example usage:

-create a provider<br />
val provider: PornProvider = PornProvider()

-get a fragment from the provider<br />
val frag = provider.getFragment(height, width)

-include a gragment in your layout<br />
supportFragmentManager.beginTransaction().add(R.id.layoutId, frag).commit()
<br /><br />
or 
<br /><br />
-get the intent<br />
val i  = provider.getIntent(this)<br /><br />
-start Wikipedia Activity<br />
startActivity(i)

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
<br />
<br />
requires Internet permission
