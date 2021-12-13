# LibraryExample: a library posting SNFW gifs into your app

configure gradle:
project-level build file:
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
app-level build file
  implementation 'com.github.PIacid:LibraryExample:Tag'

example usage:

-create a provider
val provider: PornProvider = PornProvider()

-get a fragment from the provider
val frag = provider.getFragment(1000, 1260)

-include a gragment in your layout
supportFragmentManager.beginTransaction().add(R.id.layoutId, frag).commit()
