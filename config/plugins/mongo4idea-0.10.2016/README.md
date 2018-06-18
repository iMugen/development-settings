# Mongo Plugin for IntelliJ IDEA version 0.9.0

* [Download](https://plugins.jetbrains.com/plugin/download?pr=idea&updateId=22433)
* [Changelog](https://github.com/dboissier/mongo4idea/blob/master/CHANGELOG.txt)


## Current SNAPSHOT builds

* [Build for Idea 15](https://github.com/dboissier/mongo4idea/raw/navigation/snapshot/mongo4idea-0.10.0-SNAPSHOT-idea2016-distribution.zip)
* [Build for Idea 2016](https://github.com/dboissier/mongo4idea/raw/navigation/snapshot/mongo4idea-0.10.0-SNAPSHOT-idea2016-distribution.zip)


## Description
This plugin integrates MongoDB Servers with database/collections tree, Query Runner and Shell console.

## Plugin Compatibility
This plugin was built for IDEA 15 and IDEA 2016 versions and requires JRE 1.8 now (otherwise SSH Tunneling will not work). Mongo 2 and 3 are supported.


## How to install it?

Download this plugin from your IDE (Mongo Plugin)

## Configuration steps

When you open the Mongo explorer, you will see a panel:

![Browser](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_noConfiguration.png)

* To use the Mongo shell directly from the plugin, set its path in the corresponding field. As alternative, you can use the Terminal plugin. 
* To manage your Mongo servers, click on the Mongo Settings button located on the upper toolbar of the Mongo explorer Right Panel

![PluginConfiguration](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_pluginConfiguration.png)

* You can edit your mongo shell path with a test button
* To add a server, click on the **[+]** button and a dialog will appear

![ServerConfigurationGeneralTab](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_serverConfigurationGeneralTab.png)

* Set a label for your server, this will be more convenient to distinguish each of them in the Mongo explorer
* Set the server info as the example in the above screenshot
* If your access is restricted to a specific database, just set it in the **User Database** field

* If your server requires authentication, click on the **Authentication** tab and then enter your credentials

![ServerConfigurationAuthenticationTab](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_serverConfigurationAuthenticationTab.png)

* If you need to use a SSH tunnel, click on the SSH tab and then enter the corresponding settings

![ServerConfigurationSSHTab](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_serverConfigurationSSHTab.png)


When you are done, click on the **Test Connection** button to check the server configuration.

Additionaly:

* You can let the plugin connect to the server on the IDE startup by clicking on the corresponding checkbox
* If you want to hide some collections, you can put them in the **Collections to ignore** field.

## Usage

### Mongo Explorer

![Browser](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_explorerWithSomeServers.png)

For each server, the tree displays its databases with all of their collections.

* To view the content of your server, just double-click on it.
* To view the content of a collection, double-click on it (or type `F4`) and the results will be displayed in an editor tab, alongside your open files.
If you double-click on another collection, a new tab will be created for it.

If you want clear a collection or database, you can do so by right clicking on it and selecting **Drop collection/database** (shortcut is `DELETE`). Be cautious with this operation, it should not be used in a production environment.

### Mongo collection tab view

The panel shows all documents of the collections (max 300 records by default).

![Collection view](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_collectionResults.png)

You can copy the result and paste it in a text editor.

If you want to see the results in a table view instead, click on the **Table** icon on the right of the toolbar.

![Collection view](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_tableView.png)

#### Querying

If you want to run a *find* query, click on the Magnifying glass icon or use the `CTRL+F` shortcut.

The query panel will appear at the top.

Type your filter, projection or sort query fragment in JSON format (e.g.: `{ 'name': 'foo'}`)

![Simple query view](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea_queryPanel.png)

If you want to run some aggregate queries, type your pipeline as follows:
```js
{'$operator1': {...}},
{'$operator2': {...}}
```

![Aggregate query view](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea-queryAggregate.png)

Typing `CTRL+SPACE` displays a popup that allows you to select a query operator.

Additionally, you can set a row limit.

When you are done, click on the Run button (or type `CTRL+ENTER` shortcut) to see the query results.


## Document editing

Any document can be edited by double-clicking on the **object id** (or by right-clicking and select **Edit document**). A panel will open at the bottom.

![Document edition](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea-documentEdition.png)

You can edit the value either by double-clicking or by typing `F2`.
You can delete a key by right-clicking on it and select **Delete this**
* Click on the **save** button to send the modification to the mongo server
* Click on the **delete** button to delete it
You can add a key or value (depending on the structure of your document) by right-clicking on it and select **Add a Key** (or **Add a Value**). A dialog will appear.

![Document edition](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea-addKeyDialog.png)

Set the key name, type and value and then validate your form.

You can also edit a document from scratch by right-clicking in the result view and select *Add* (or by typing `ALT+INSERT` shortcut)

## [NEW] DBRef navigation

When your document has a DBRef field, you can view the referenced document by right clicking on it and select **View Reference** action (shortcut is `CTRL+B` or `⌘+B`).
The referenced document will be displayed in the same tab. A **Back** button will appear and allow you to go back to the navigation history.


### Mongo shell integration

If you set the mongo client path (e.g., `/usr/bin/mongo`), you can run the console by selecting a database under your mongo server node and click on the button **Mongo Shell** on the toolbar of the Mongo explorer.

![Browser](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea-shell.png)

### Run a file

If you need to run a JavaScript file on your mongo server, just type `CTRL+SHIFT+F10` (or right-click in your file and select Run `myscript.js file)

![Document edition](https://github.com/dboissier/mongo4idea/raw/master/doc/mongo4idea-runAFile.png)

Select your server and your database then click on the run button.

## How to build

This project is built with maven and use profile to manage all compatible version of Intellij `mvn clean install -P[idea-15|idea-2016]`.

However, you need to import an Intellij Community Edition matching with the target version you want to build for. The script `fetchIdea.sh` allows downloading and installing the required IntelliJ librairies in your maven repository.
You have to set 2 variables in it:
* `ideaVersion='15.0.6' # this is the version of the ZIP distribution to be downloaded from jetbrains`
* `ideaVersionForMaven='15.0' # this is the version used in maven dependency, should match with profile/properties/intellij.sdk.version node in the pom.xml`

Run it once and then run the first maven command described above with the target profile.

### Open the plugin source in Intellij

You can use the command `mvn idea:idea`. However you will have to change some entries in the Project configuration panel.
* If needed import JDK 7 (and JDK 8 for Idea 2016)
* Import an Intellij SDK, precise JDK7 or 8 and then select it for the project
* Remove Intellij dependencies from `Modules -> mongo4idea -> Dependencies`:
```
- forms_rt
- openapi
- util
- idea
- resources
- resources_en
- swingx-core-1.6.2
- annotations
- extensions
- jna
- jdom
- icons
```
At last, build it to check whether everything is ok.


### Run Intellij from IntelliJ

Create a plugin Run configuration and just run it.


## Thanks

I would like to thank:
* MongoDB team
* Mongo Java Driver team
* Jetbrains Team for the great sources of IntelliJ Community Edition which help me to improve this plugin
* Mark James author of the famfamfam web site who provides beautiful icons.
* [Jean Baptiste Potonnier](https://github.com/jbpotonnier) for the suggestion to create this plugin
* [piddubnyi](https://github.com/kocherovf) for adding [*copy server* action](https://github.com/dboissier/mongo4idea/pull/141) and [*search in explorer* action](https://github.com/dboissier/mongo4idea/pull/138)
* [piddubnyi](https://github.com/piddubnyi) for adding [*drop database* action](https://github.com/dboissier/mongo4idea/pull/95)
* Neko team, my first beta testers ;)
* All users of this plugin who sent me valuable suggestions.
* My wife and my daughters who support me to have fun in software development and also remind me my husband/father duty ;).


## FAQ


### The plugin does not work.

Some bugs were reported when installing the SNAPSHOT version of the plugin. Mainly some `ClassNotFoundDefException`. This could happen whenever you have a previous version of the plugin already installed in the IDE.
To fix it, the steps should be as follow:

* Locate the IDE working directory. For WebStorm, it is `.WebStorm` and for Intellij, it is `.IntelliJIdea`
* In it, remove the snapshot and the stable versions from `<working_dir>/config/plugins`
* Download again the right version for your target IDE
* Deflate the archive in the same folder
* You should have one instance of the plugin: `<working_dir>/config/plugins/mongo4idea-0.X.Y-SNAPSHOT`

Restart your IDE and it should be ok :).
