# LibraryExample: a library posting SNFW gifs into your app

dependency:
implementation 'com.github.PIacid:LibraryExample:Tag'

example usage:

-create a provider
val provider: PornProvider = PornProvider()

-get a fragment from the provider
val frag = provider.getFragment(1000, 1260)

-include a gragment in your layout
supportFragmentManager.beginTransaction().add(R.id.layoutId, frag).commit()
