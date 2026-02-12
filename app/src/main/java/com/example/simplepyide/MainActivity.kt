override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.main_menu, menu)
    return true
}

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == R.id.action_run) {
        runPythonCode()
        return true
    }
    return super.onOptionsItemSelected(item)
}
