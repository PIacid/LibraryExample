# LibraryExample: 
a library posting SNFW gifs into your app

example usage:

-create a provider
val provider: PornProvider = PornProvider()

-get a fragment from the provider
val frag = provider.getFragment(1000, 1260)

-include a gragment in your layout
supportFragmentManager.beginTransaction().add(R.id.layoutId, frag).commit()

gradle config: <br />
	allprojects { <br />
		repositories { <br />
			... <br />
			maven { url 'https://jitpack.io' } <br />
		} <br />
	} <br />
dependencies { <br />
	implementation 'com.github.PIacid:LibraryExample:$version' <br />
} 
