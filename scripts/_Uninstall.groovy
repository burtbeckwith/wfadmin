//
// This script is executed by Grails when the plugin is uninstalled from project.
// Use this script if you intend to do any additional clean-up on uninstall, but
// beware of messing up SVN directories!
//
ant.delete(dir:"${basedir}/web-app/js/webfileadmin")
ant.delete(dir:"${basedir}/web-app/css/webfileadmin")
ant.delete(dir:"${basedir}/web-app/images/webfileadmin")