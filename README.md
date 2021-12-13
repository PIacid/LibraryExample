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
&enspallprojects { <br />
&ensp&ensprepositories { <br />
&ensp&ensp&ensp... <br />
&ensp&ensp&enspmaven { url 'https://jitpack.io' } <br />
&ensp&ensp} <br />
&ensp} <br />
dependencies { <br />
	implementation 'com.github.PIacid:LibraryExample:1.1' <br />
} 
