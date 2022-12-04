# Interview Questions

<details>
<summary>1. What’s a design pattern?</summary>

> **Answer:**
>
> Design patterns are typical solutions to commonly occurring problems in software design.

</details>

<details>
<summary>2. What types of design patters you know?</summary>

> **Answer:**
>
> -   Creational patterns
> -   Structural patterns
> -   Behavioral patterns

</details>

<details>
<summary>2. Factory Method?</summary>

> **Answer:**
>
> Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
> but allows subclasses to alter the type of objects that will be created.
>
> ```
> class Dialog is
>    abstract method createButton()
>    method render() is
>        Button okButton = createButton()
>        okButton.onClick(closeDialog)
>        okButton.render()
>
> class WindowsDialog extends Dialog is
>    method createButton() is
>        return new WindowsButton()
>
> class WebDialog extends Dialog is
>    method createButton() is
>        return new HTMLButton()
>
> interface Button is
>    method render()
>    method onClick(f)
>
> class WindowsButton implements Button is
>    method render(a, b) is
>    method onClick(f) is
>
> class HTMLButton implements Button is
>    method render(a, b) is
>    method onClick(f) is
>
>
> class Application is
>    field dialog: Dialog
>
>    method initialize() is
>        config = readApplicationConfigFile()
>
>        if (config.OS == "Windows") then
>            dialog = new WindowsDialog()
>        else if (config.OS == "Web") then
>            dialog = new WebDialog()
>        else
>            throw new Exception("Error! Unknown operating system.")
>    method main() is
>        this.initialize()
>        dialog.render()
> ```

</details>

<details>
<summary>3. Abstract Factory?</summary>

> **Answer:**
>
> Abstract Factory is a creational design pattern that lets you produce families of related objects
> without specifying their concrete classes.
>
> ```
> interface GUIFactory is
>    method createButton():Button
>    method createCheckbox():Checkbox
>
> class WinFactory implements GUIFactory is
>    method createButton():Button is
>        return new WinButton()
>    method createCheckbox():Checkbox is
>        return new WinCheckbox()
>
> class MacFactory implements GUIFactory is
>    method createButton():Button is
>        return new MacButton()
>    method createCheckbox():Checkbox is
>        return new MacCheckbox()
>
> interface Button is
>    method paint()
>
> class WinButton implements Button is
>    method paint() is
>
> class MacButton implements Button is
>    method paint() is
>
> interface Checkbox is
>    method paint()
>
> class WinCheckbox implements Checkbox is
>    method paint() is
>
> class MacCheckbox implements Checkbox is
>    method paint() is
>
> class Application is
>    private field button: Button
>    constructor Application(factory: GUIFactory) is
>        this.factory = factory
>    method createUI() is
>        this.button = factory.createButton()
>    method paint() is
>        button.paint()
>
> class ApplicationConfigurator is
>    method main() is
>        config = readApplicationConfigFile()
>
>        if (config.OS == "Windows") then
>            factory = new WinFactory()
>        else if (config.OS == "Mac") then
>            factory = new MacFactory()
>        else
>            throw new Exception("Error! Unknown operating system.")
>
>        Application app = new Application(factory)
> ```

</details>

<details>
<summary>4. Builder?</summary>

> **Answer:**
>
> Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows
> you to produce different types and representations of an object using the same construction code.
>
> ```
> class Car is
>
> class Manual is
>
> interface Builder is
>    method reset()
>    method setSeats(...)
>    method setEngine(...)
>    method setTripComputer(...)
>    method setGPS(...)
>
> class CarBuilder implements Builder is
>    private field car:Car
>
>    constructor CarBuilder() is
>        this.reset()
>
>    method reset() is
>        this.car = new Car()
>
>    method setSeats(...) is
>
>    method setEngine(...) is
>
>    method setTripComputer(...) is
>
>    method setGPS(...) is
>
>    method getProduct():Car is
>        product = this.car
>        this.reset()
>        return product
>
> class CarManualBuilder implements Builder is
>    private field manual:Manual
>
>    constructor CarManualBuilder() is
>        this.reset()
>
>    method reset() is
>        this.manual = new Manual()
>
>    method setSeats(...) is
>
>    method setEngine(...) is
>
>    method setTripComputer(...) is
>
>    method setGPS(...) is
>
>    method getProduct():Manual is
>
> class Director is
>    private field builder:Builder
>
>    method setBuilder(builder:Builder)
>        this.builder = builder
>
>    method constructSportsCar(builder: Builder) is
>        builder.reset()
>        builder.setSeats(2)
>        builder.setEngine(new SportEngine())
>        builder.setTripComputer(true)
>        builder.setGPS(true)
>
>    method constructSUV(builder: Builder) is
>
> class Application is
>
>    method makeCar() is
>        director = new Director()
>
>        CarBuilder builder = new CarBuilder()
>        director.constructSportsCar(builder)
>        Car car = builder.getProduct()
>
>        CarManualBuilder builder = new CarManualBuilder()
>        director.constructSportsCar(builder)
>
>        Manual manual = builder.getProduct()
> ```

</details>

<details>
<summary>5. Prototype?</summary>

> **Answer:**
>
> Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on
> their classes.
>
> ```
> abstract class Shape is
>    field X: int
>    field Y: int
>    field color: string
>
>    constructor Shape() is
>
>    constructor Shape(source: Shape) is
>        this()
>        this.X = source.X
>        this.Y = source.Y
>        this.color = source.color
>
>    abstract method clone():Shape
>
> class Rectangle extends Shape is
>    field width: int
>    field height: int
>
>    constructor Rectangle(source: Rectangle) is
>        super(source)
>        this.width = source.width
>        this.height = source.height
>
>    method clone():Shape is
>        return new Rectangle(this)
>
>
> class Circle extends Shape is
>    field radius: int
>
>    constructor Circle(source: Circle) is
>        super(source)
>        this.radius = source.radius
>
>    method clone():Shape is
>        return new Circle(this)
>
>
> class Application is
>    field shapes: array of Shape
>
>    constructor Application() is
>        Circle circle = new Circle()
>        circle.X = 10
>        circle.Y = 10
>        circle.radius = 20
>        shapes.add(circle)
>
>        Circle anotherCircle = circle.clone()
>        shapes.add(anotherCircle)
>
>        Rectangle rectangle = new Rectangle()
>        rectangle.width = 10
>        rectangle.height = 20
>        shapes.add(rectangle)
>
>    method businessLogic() is
>        Array shapesCopy = new Array of Shapes.
>
>        foreach (s in shapes) do
>            shapesCopy.add(s.clone())
>
> ```

</details>

<details>
<summary>6. Singleton?</summary>

> **Answer:**
>
> Singleton is a creational design pattern that lets you ensure that a class has only one instance, while
> providing a global access point to this instance.
>
> ```
> class Database is
>    private static field instance: Database
>
>    private constructor Database() is
>
>    public static method getInstance() is
>        if (this.instance == null) then
>            acquireThreadLock() and then
>                if (this.instance == null) then
>                    this.instance = new Database()
>        return this.instance
>
>    public method query(sql) is
>
> class Application is
>    method main() is
>        Database foo = Database.getInstance()
>        foo.query("SELECT ...")
>        Database bar = Database.getInstance()
>        bar.query("SELECT ...")
> ```

</details>

<details>
<summary>7. Adapter?</summary>

> **Answer:**
>
> Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
>
> ```
> class RoundHole is
>    constructor RoundHole(radius) { ... }
>
>    method getRadius() is
>
>    method fits(peg: RoundPeg) is
>        return this.getRadius() >= peg.radius()
>
> class RoundPeg is
>    constructor RoundPeg(radius) { ... }
>
>    method getRadius() is
>
>
> class SquarePeg is
>    constructor SquarePeg(width) { ... }
>
>    method getWidth() is
>
>
> class SquarePegAdapter extends RoundPeg is
>    private field peg: SquarePeg
>
>    constructor SquarePegAdapter(peg: SquarePeg) is
>        this.peg = peg
>
>    method getRadius() is
>        return peg.getWidth() * Math.sqrt(2) / 2
>
>
> hole = new RoundHole(5)
> rpeg = new RoundPeg(5)
> hole.fits(rpeg) // true
>
> small_sqpeg = new SquarePeg(5)
> large_sqpeg = new SquarePeg(10)
> hole.fits(small_sqpeg) // this won't compile (incompatible types)
>
> small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg)
> large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg)
> hole.fits(small_sqpeg_adapter) // true
> hole.fits(large_sqpeg_adapter) // false
> ```

</details>

<details>
<summary>8. Bridge?</summary>

> **Answer:**
>
> ridge is a structural design pattern that lets you split a large class or a set of closely related classes into two
> separate hierarchies—abstraction and implementation—which can be developed independently of each other.
>
> ```
> class RemoteControl is
>    protected field device: Device
>    constructor RemoteControl(device: Device) is
>        this.device = device
>    method togglePower() is
>        if (device.isEnabled()) then
>            device.disable()
>        else
>            device.enable()
>    method volumeDown() is
>        device.setVolume(device.getVolume() - 10)
>    method volumeUp() is
>        device.setVolume(device.getVolume() + 10)
>    method channelDown() is
>        device.setChannel(device.getChannel() - 1)
>    method channelUp() is
>        device.setChannel(device.getChannel() + 1)
>
>
> class AdvancedRemoteControl extends RemoteControl is
>    method mute() is
>        device.setVolume(0)
>
> interface Device is
>    method isEnabled()
>    method enable()
>    method disable()
>    method getVolume()
>    method setVolume(percent)
>    method getChannel()
>    method setChannel(channel)
>
> class Tv implements Device is
>
> class Radio implements Device is
>
>
> // Somewhere in client code.
> tv = new Tv()
> remote = new RemoteControl(tv)
> remote.togglePower()
>
> radio = new Radio()
> remote = new AdvancedRemoteControl(radio)
> ```

</details>

<details>
<summary>9. Composite?</summary>

> **Answer:**
>
> Composite is a structural design pattern that lets you compose objects into tree structures and then work with these
> structures as if they were individual objects.
>
> ```
> interface Graphic is
>    method move(x, y)
>    method draw()
>
> class Dot implements Graphic is
>    field x, y
>
>    constructor Dot(x, y) { ... }
>
>    method move(x, y) is
>        this.x += x, this.y += y
>
>    method draw() is
>
> class Circle extends Dot is
>    field radius
>
>    constructor Circle(x, y, radius) { ... }
>
>    method draw() is
>
> class CompoundGraphic implements Graphic is
>    field children: array of Graphic
>
>    method add(child: Graphic) is
>
>    method remove(child: Graphic) is
>
>    method move(x, y) is
>        foreach (child in children) do
>            child.move(x, y)
>
>    method draw() is
>
> class ImageEditor is
>    method load() is
>        all = new CompoundGraphic()
>        all.add(new Dot(1, 2))
>        all.add(new Circle(5, 3, 10))
>
>    method groupSelected(components: array of Graphic) is
>        group = new CompoundGraphic()
>        group.add(components)
>        all.remove(components)
>        all.add(group)
>        all.draw()
> ```

</details>

<details>
<summary>10. Decorator?</summary>

> **Answer:**
>
> Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside
> special wrapper objects that contain the behaviors.
>
> ```
> interface DataSource is
>    method writeData(data)
>    method readData():data
>
> class FileDataSource implements DataSource is
>    constructor FileDataSource(filename) { ... }
>
>    method writeData(data) is
>
>    method readData():data is
>
> class DataSourceDecorator implements DataSource is
>    protected field wrappee: DataSource
>
>    constructor DataSourceDecorator(source: DataSource) is
>        wrappee = source
>
>    method writeData(data) is
>        wrappee.writeData(data)
>
>    method readData():data is
>        return wrappee.readData()
>
> class EncryptionDecorator extends DataSourceDecorator is
>    method writeData(data) is
>
>    method readData():data is
>
> class CompressionDecorator extends DataSourceDecorator is
>    method writeData(data) is
>    method readData():data is
>
> class Application is
>    method dumbUsageExample() is
>        source = new FileDataSource("somefile.dat")
>        source.writeData(salaryRecords)
>
>        source = new CompressionDecorator(source)
>        source.writeData(salaryRecords)
>
>        source = new EncryptionDecorator(source)
>        source.writeData(salaryRecords)
>
> class SalaryManager is
>    field source: DataSource
>
>    constructor SalaryManager(source: DataSource) { ... }
>
>    method load() is
>        return source.readData()
>
>    method save() is
>        source.writeData(salaryRecords)
>
>
> class ApplicationConfigurator is
>    method configurationExample() is
>        source = new FileDataSource("salary.dat")
>        if (enabledEncryption)
>            source = new EncryptionDecorator(source)
>        if (enabledCompression)
>            source = new CompressionDecorator(source)
>
>        logger = new SalaryManager(source)
>        salary = logger.load()
> ```

</details>

<details>
<summary>11. Facade?</summary>

> **Answer:**
>
> Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other
> complex set of classes.
>
> ```
> class VideoFile
>
> class OggCompressionCodec
>
> class MPEG4CompressionCodec
>
> class CodecFactory
>
> class BitrateReader
>
> class AudioMixer
>
> class VideoConverter is
>    method convert(filename, format):File is
>        file = new VideoFile(filename)
>        sourceCodec = new CodecFactory.extract(file)
>        if (format == "mp4")
>            destinationCodec = new MPEG4CompressionCodec()
>        else
>            destinationCodec = new OggCompressionCodec()
>        buffer = BitrateReader.read(filename, sourceCodec)
>        result = BitrateReader.convert(buffer, destinationCodec)
>        result = (new AudioMixer()).fix(result)
>        return new File(result)
>
> class Application is
>    method main() is
>        convertor = new VideoConverter()
>        mp4 = convertor.convert("youtubevideo.ogg", "mp4")
>        mp4.save()
> ```

</details>

<details>
<summary>12. Flyweight?</summary>

> **Answer:**
>
> Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing
> common parts of state between multiple objects instead of keeping all of the data in each object.
>
> ```
> class TreeType is
>    field name
>    field color
>    field texture
>    constructor TreeType(name, color, texture) { ... }
>    method draw(canvas, x, y) is
>
> class TreeFactory is
>    static field treeTypes: collection of tree types
>    static method getTreeType(name, color, texture) is
>        type = treeTypes.find(name, color, texture)
>        if (type == null)
>            type = new TreeType(name, color, texture)
>            treeTypes.add(type)
>        return type
>
> class Tree is
>    field x,y
>    field type: TreeType
>    constructor Tree(x, y, type) { ... }
>    method draw(canvas) is
>        type.draw(canvas, this.x, this.y)
>
> class Forest is
>    field trees: collection of Trees
>
>    method plantTree(x, y, name, color, texture) is
>        type = TreeFactory.getTreeType(name, color, texture)
>        tree = new Tree(x, y, type)
>        trees.add(tree)
>
>    method draw(canvas) is
>        foreach (tree in trees) do
>            tree.draw(canvas)
> ```

</details>

<details>
<summary>13. Proxy?</summary>

> **Answer:**
>
> Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy
> controls access to the original object, allowing you to perform something either before or after the request gets
> through to the original object.
>
> ```
> interface ThirdPartyYoutubeLib is
>    method listVideos()
>    method getVideoInfo(id)
>    method downloadVideo(id)
>
> class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib is
>    method listVideos() is
>
>    method getVideoInfo(id) is
>
>    method downloadVideo(id) is
>
> class CachedYoutubeClass implements ThirdPartyYouTubeLib is
>    private field service: ThirdPartyYouTubeClass
>    private field listCache, videoCache
>    field needReset
>
>    constructor CachedYoutubeClass(service: ThirdPartyYouTubeLib) is
>        this.service = service
>
>    method listVideos() is
>        if (listCache == null || needReset)
>            listCache = service.listVideos()
>        return listCache
>
>    method getVideoInfo(id) is
>        if (videoCache == null || needReset)
>            videoCache = service.getVideoInfo(id)
>        return videoCache
>
>    method downloadVideo(id) is
>        if (!downloadExists(id) || needReset)
>            service.downloadVideo(id)
>
> class YoutubeManager is
>    protected field service: ThirdPartyYouTubeLib
>
>    constructor YoutubeManager(service: ThirdPartyYouTubeLib) is
>        this.service = service
>
>    method renderVideoPage(id) is
>        info = service.getVideoInfo(id)
>
>    method renderListPanel() is
>        list = service.listVideos()
>
>    method reactOnUserInput() is
>        renderVideoPage()
>        renderListPanel()
>
> class Application is
>    method init() is
>        aYouTubeService = new ThirdPartyYouTubeClass()
>        aYouTubeProxy = new CachedYouTubeClass(aYouTubeService)
>        manager = new YouTubeManager(aYouTubeProxy)
>        manager.reactOnUserInput()
> ```

</details>

<details>
<summary>14. Chain of Responsibility?</summary>

> **Answer:**
>
> Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon
> receiving a request, each handler decides either to process the request or to pass it to the next handler in the
> chain.
>
> ```
> interface ComponentWithContextualHelp is
>    method showHelp()
>
>
> abstract class Component implements ComponentWithContextualHelp is
>    field tooltipText: string
>
>    protected field container: Container
>
>    method showHelp() is
>        if (tooltipText != null)
>            // Show tooltip.
>        else
>            container.showHelp()
>
> abstract class Container extends Component is
>    protected field children: array of Component
>
>    method add(child) is
>        children.add(child)
>        child.container = this
>
> class Button extends Component is
>
> class Panel extends Container is
>    field modalHelpText: string
>
>    method showHelp() is
>        if (modalHelpText != null)
>        else
>            super.showHelp()
>
> class Dialog extends Container is
>    field wikiPageURL: string
>
>    method showHelp() is
>        if (wikiPageURL != null)
>        else
>            super.showHelp()
>
> class Application is
>    method createUI() is
>        dialog = new Dialog("Budget Reports")
>        dialog.wikiPageURL = "http://..."
>        panel = new Panel(0, 0, 400, 800)
>        panel.modalHelpText = "This panel does..."
>        ok = new Button(250, 760, 50, 20, "OK")
>        ok.tooltipText = "This is an OK button that..."
>        cancel = new Button(320, 760, 50, 20, "Cancel")
>        // ...
>        panel.add(ok)
>        panel.add(cancel)
>        dialog.add(panel)
>
>    method onF1KeyPress() is
>        component = this.getComponentAtMouseCoords()
>        component.showHelp()
> ```

</details>

<details>
<summary>15. Command?</summary>

> **Answer:**
>
> Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information
> about the request. This transformation lets you parameterize methods with different requests, delay or queue a
> request’s execution, and support undoable operations.
>
> ```
> abstract class Command is
>    protected field app: Application
>    protected field editor: Editor
>    protected field backup: text
>
>    constructor Command(app: Application, editor: Editor) is
>        this.app = app
>        this.editor = editor
>
>    method saveBackup() is
>        backup = editor.text
>
>    method undo() is
>        editor.text = backup
>
>    abstract method execute()
>
>
> class CopyCommand extends Command is
>    method execute() is
>        app.clipboard = editor.getSelection()
>        return false
>
> class CutCommand extends Command is
>    method execute() is
>        saveBackup()
>        app.clipboard = editor.getSelection()
>        editor.deleteSelection()
>        return true
>
> class PasteCommand extends Command is
>    method execute() is
>        saveBackup()
>        editor.replaceSelection(app.clipboard)
>        return true
>
> class UndoCommand extends Command is
>    method execute() is
>        app.undo()
>        return false
>
> class CommandHistory is
>    private field history: array of Command
>
>    method push(c: Command) is
>
>    method pop():Command is
>
>
> class Editor is
>    field text: string
>
>    method getSelection() is
>
>    method deleteSelection() is
>
>    method replaceSelection(text) is
>
>
> class Application is
>    field clipboard: string
>    field editors: array of Editors
>    field activeEditor: Editor
>    field history: CommandHistory
>
>    method createUI() is
>        copy = function() { executeCommand(
>            new CopyCommand(this, activeEditor)) }
>        copyButton.setCommand(copy)
>        shortcuts.onKeyPress("Ctrl+C", copy)
>
>        cut = function() { executeCommand(
>            new CutCommand(this, activeEditor)) }
>        cutButton.setCommand(cut)
>        shortcuts.onKeyPress("Ctrl+X", cut)
>
>        paste = function() { executeCommand(
>            new PasteCommand(this, activeEditor)) }
>        pasteButton.setCommand(paste)
>        shortcuts.onKeyPress("Ctrl+V", paste)
>
>        undo = function() { executeCommand(
>            new UndoCommand(this, activeEditor)) }
>        undoButton.setCommand(undo)
>        shortcuts.onKeyPress("Ctrl+Z", undo)
>
>    method executeCommand(command) is
>        if (command.execute)
>            history.push(command)
>
>    method undo() is
>        command = history.pop()
>        if (command != null)
>            command.undo()
> ```

</details>

<details>
<summary>16. Iterator?</summary>

> **Answer:**
>
> Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying
> representation (list, stack, tree, etc.).
>
> ```
> interface SocialNetwork is
>    method createFriendsIterator(profileId):ProfileIterator
>    method createCoworkersIterator(profileId):ProfileIterator
>
> class Facebook implements SocialNetwork is
>
>    method createFriendsIterator(profileId) is
>        return new FacebookIterator(this, profileId, "friends")
>    method createCoworkersIterator(profileId) is
>        return new FacebookIterator(this, profileId, "coworkers")
>
>
> interface ProfileIterator is
>    method getNext():Profile
>    method hasMore():bool
>
>
> class FacebookIterator implements ProfileIterator is
>    private field facebook: Facebook
>    private field profileId, type: string
>
>    private field currentPosition
>    private field cache: array of Profile
>
>    constructor FacebookIterator(facebook, profileId, type) is
>        this.facebook = facebook
>        this.profileId = profileId
>        this.type = type
>
>    private method lazyInit() is
>        if (cache == null)
>            cache = facebook.socialGraphRequest(profileId, type)
>
>    method getNext() is
>        if (hasMore())
>            currentPosition++
>            return cache[currentPosition]
>
>    method hasMore() is
>        lazyInit()
>        return cache.length < currentPosition
>
> class SocialSpammer is
>    method send(iterator: ProfileIterator, message: string) is
>        while (iterator.hasNext())
>            profile = iterator.getNext()
>            System.sendEmail(profile.getEmail(), message)
>
>
> class Application is
>    field network: SocialNetwork
>    field spammer: SocialSpammer
>
>    method config() is
>        if working with Facebook
>            this.network = new Facebook()
>        if working with LinkedIn
>            this.network = new LinkedIn()
>        this.spammer = new SocialSpammer()
>
>    method sendSpamToFriends(profile) is
>        iterator = network.createFriendsIterator(profile.getId())
>        spammer.send(iterator, "Very important message")
>
>    method sendSpamToCoworkers(profile) is
>        iterator = network.createCoworkersIterator(profile.getId())
>        spammer.send(iterator, "Very important message")
> ```

</details>

<details>
<summary>17. Mediator?</summary>

> **Answer:**
>
> Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern
> restricts direct communications between the objects and forces them to collaborate only via a mediator object.
>
> ```
> interface Mediator is
>    method notify(sender: Component, event: string)
>
> class AuthenticationDialog implements Mediator is
>    private field title: string
>    private field loginOrRegisterChkBx: Checkbox
>    private field loginUsername, loginPassword: Textbox
>    private field registrationUsername, registrationPassword
>    private field registrationEmail: Textbox
>    private field okBtn, cancelBtn: Button
>
>    constructor AuthenticationDialog() is
>
>    method notify(sender, event) is
>        if (sender == loginOrRegisterChkBx and event == "check")
>            if (loginOrRegisterChkBx.checked)
>                title = "Log in"
>            else
>                title = "Register"
>
>        if (sender == okBtn && event == "click")
>            if (loginOrRegister.checked)
>                if (!found)
>            else
>
> class Component is
>    field dialog: Mediator
>
>    constructor Component(dialog) is
>        this.dialog = dialog
>
>    method click() is
>        dialog.notify(this, "click")
>
>    method keypress() is
>        dialog.notify(this, "keypress")
>
> class Button extends Component is
>
> class Textbox extends Component is
>
> class Checkbox extends Component is
>    method check() is
>        dialog.notify(this, "check")nterface Mediator is
>    method notify(sender: Component, event: string)
>
> class AuthenticationDialog implements Mediator is
>    private field title: string
>    private field loginOrRegisterChkBx: Checkbox
>    private field loginUsername, loginPassword: Textbox
>    private field registrationUsername, registrationPassword
>    private field registrationEmail: Textbox
>    private field okBtn, cancelBtn: Button
>
>    constructor AuthenticationDialog() is
>
>    method notify(sender, event) is
>        if (sender == loginOrRegisterChkBx and event == "check")
>            if (loginOrRegisterChkBx.checked)
>                title = "Log in"
>            else
>                title = "Register"
>
>        if (sender == okBtn && event == "click")
>            if (loginOrRegister.checked)
>                if (!found)
>            else
>
> class Component is
>    field dialog: Mediator
>
>    constructor Component(dialog) is
>        this.dialog = dialog
>
>    method click() is
>        dialog.notify(this, "click")
>
>    method keypress() is
>        dialog.notify(this, "keypress")
>
> class Button extends Component is
>    // ...
>
> class Textbox extends Component is
>    // ...
>
> class Checkbox extends Component is
>    method check() is
>        dialog.notify(this, "check")
> ```

</details>

<details>
<summary>18. Memento?</summary>

> **Answer:**
>
> Memento is a behavioral design pattern that lets you save and restore the previous state of an object without
> revealing the details of its implementation.
>
> ```
> class Editor is
>    private field text, curX, curY, selectionWidth
>
>    method setText(text) is
>        this.text = text
>
>    method setCursor(x, y) is
>        this.curX = curX
>        this.curY = curY
>
>    method setSelectionWidth(width) is
>        this.selectionWidth = width
>
>    method createSnapshot():Snapshot is
>        return new Snapshot(this, text, curX, curY, selectionWidth)
>
> class Snapshot is
>    private field editor: Editor
>    private field text, curX, curY, selectionWidth
>
>    constructor Snapshot(editor, text, curX, curY, selectionWidth) is
>        this.editor = editor
>        this.text = text
>        this.curX = curX
>        this.curY = curY
>        this.selectionWidth = selectionWidth
>
>    method restore() is
>        editor.setText(text)
>        editor.setCursor(curX, curY)
>        editor.setSelectionWidth(selectionWidth)
>
> class Command is
>    private field backup: Snapshot
>
>    method makeBackup() is
>        backup = editor.createSnapshot()
>
>    method undo() is
>        if (backup != null)
>            backup.restore()
> ```

</details>

<details>
<summary>19. Observer?</summary>

> **Answer:**
>
> Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about
> any events that happen to the object they’re observing.
>
> ```
> class EventManager is
>    private field listeners: hash map of event types and listeners
>
>    method subscribe(eventType, listener) is
>        listeners.add(eventType, listener)
>
>    method unsubscribe(eventType, listener) is
>        listeners.remove(eventType, listener)
>
>    method notify(eventType, data) is
>        foreach (listener in listeners.of(eventType)) do
>            listener.update(data)
>
> class Editor is
>    private field events: EventManager
>    private field file: File
>
>    constructor Editor() is
>        events = new EventManager()
>
>    method openFile(path) is
>        this.file = new File(path)
>        events.notify("open", file.name)
>
>    method saveFile() is
>        file.write()
>        events.notify("save", file.name)
>
>
>
> interface EventListener is
>    method update(filename)
>
> class LoggingListener implements EventListener is
>    private field log: File
>    private field message
>
>    constructor LoggingListener(log_filename, message) is
>        this.log = new File(log_filename)
>        this.message = message
>
>    method update(filename) is
>        log.write(replace('%s',filename,message))
>
> class EmailAlertsListener implements EventListener is
>    private field email: string
>
>    constructor EmailAlertsListener(email, message) is
>        this.email = email
>        this.message = message
>
>    method update(filename) is
>        system.email(email, replace('%s',filename,message))
>
>
> class Application is
>    method config() is
>        editor = new TextEditor()
>
>        logger = new LoggingListener(
>            "/path/to/log.txt",
>            "Someone has opened the file: %s");
>        editor.events.subscribe("open", logger)
>
>        emailAlerts = new EmailAlertsListener(
>            "admin@example.com",
>            "Someone has changed the file: %s")
>        editor.events.subscribe("save", emailAlerts)
> ```

</details>

<details>
<summary>20. State?</summary>

> **Answer:**
>
> State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
> It appears as if the object changed its class.
>
> ```
> class AudioPlayer is
>    field state: State
>    field UI, volume, playlist, currentSong
>
>    constructor AudioPlayer() is
>        this.state = new ReadyState(this)
>
>        UI = new UserInterface()
>        UI.lockButton.onClick(this.clickLock)
>        UI.playButton.onClick(this.clickPlay)
>        UI.nextButton.onClick(this.clickNext)
>        UI.prevButton.onClick(this.clickPrevious)
>
>    method changeState(state: State) is
>        this.state = state
>
>    method clickLock() is
>        state.clickLock()
>    method clickPlay() is
>        state.clickPlay()
>    method clickNext() is
>        state.clickNext()
>    method clickPrevious() is
>        state.clickPrevious()
>
>    method startPlayback() is
>        // ...
>    method stopPlayback() is
>        // ...
>    method nextSong() is
>        // ...
>    method previousSong() is
>        // ...
>    method fastForward(time) is
>        // ...
>    method rewind(time) is
>        // ...
>
> abstract class State is
>    protected field player: AudioPlayer
>
>    constructor State(player) is
>        this.player = player
>
>    abstract method clickLock()
>    abstract method clickPlay()
>    abstract method clickNext()
>    abstract method clickPrevious()
>
> class LockedState extends State is
>
>    method clickLock() is
>        if (player.playing)
>            player.changeState(new PlayingState(player))
>        else
>            player.changeState(new ReadyState(player))
>
>    method clickPlay() is
>        // Locked, so do nothing.
>
>    method clickNext() is
>        // Locked, so do nothing.
>
>    method clickPrevious() is
>        // Locked, so do nothing.
>
>
> class ReadyState extends State is
>    method clickLock() is
>        player.changeState(new LockedState(player))
>
>    method clickPlay() is
>        player.startPlayback()
>        player.changeState(new PlayingState(player))
>
>    method clickNext() is
>        player.nextSong()
>
>    method clickPrevious() is
>        player.previousSong()
>
>
> class PlayingState extends State is
>    method clickLock() is
>        player.changeState(new LockedState(player))
>
>    method clickPlay() is
>        player.stopPlayback()
>        player.changeState(new ReadyState(player))
>
>    method clickNext() is
>        if (event.doubleclick)
>            player.nextSong()
>        else
>            player.fastForward(5)
>
>    method clickPrevious() is
>        if (event.doubleclick)
>            player.previous()
>        else
>            player.rewind(5)
> ```

</details>

<details>
<summary>21. Strategy?</summary>

> **Answer:**
>
> Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate
> class, and make their objects interchangeable.
>
> ```
> interface Strategy is
>    method execute(a, b)
>
> class ConcreteStrategyAdd implements Strategy is
>    method execute(a, b) is
>        return a + b
>
> class ConcreteStrategySubtract implements Strategy is
>    method execute(a, b) is
>        return a - b
>
> class ConcreteStrategyMultiply implements Strategy is
>    method execute(a, b) is
>        return a * b
>
> class Context is
>    private strategy: Strategy
>
>    method setStrategy(Strategy strategy) is
>        this.strategy = strategy
>
>    method executeStrategy(int a, int b) is
>        return strategy.execute(a, b)
>
>
> class ExampleApplication is
>    method main() is
>        Create context object.
>
>        Read first number.
>        Read last number.
>        Read the desired action from user input.
>
>        if (action == addition) then
>            context.setStrategy(new ConcreteStrategyAdd())
>
>        if (action == subtraction) then
>            context.setStrategy(new ConcreteStrategySubtract())
>
>        if (action == multiplication) then
>            context.setStrategy(new ConcreteStrategyMultiply())
>
>        result = context.executeStrategy(First number, Second number)
>
>        Print result.
> ```

</details>

<details>
<summary>22. Template Method?</summary>

> **Answer:**
>
> Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets
> subclasses override specific steps of the algorithm without changing its structure.
>
> ```
> class GameAI is
>    method turn() is
>        collectResources()
>        buildStructures()
>        buildUnits()
>        attack()
>
>    method collectResources() is
>        foreach (s in this.builtStructures) do
>            s.collect()
>
>    abstract method buildStructures()
>    abstract method buildUnits()
>
>    method attack() is
>        enemy = closestEnemy()
>        if (enemy == null)
>            sendScouts(map.center)
>        else
>            sendWarriors(enemy.position)
>
>    abstract method sendScouts(position)
>    abstract method sendWarriors(position)
>
> class OrcsAI extends GameAI is
>    method buildStructures() is
>        if (there are some resources) then
>
>    method buildUnits() is
>        if (there are plenty of resources) then
>            if (there are no scouts)
>            else
>
>    method sendScouts(position) is
>        if (scouts.length > 0) then
>            // Send scouts to position.
>
>    method sendWarriors(position) is
>        if (warriors.length > 5) then
>            // Send warriors to position.
>
> class MonstersAI extends GameAI is
>    method collectResources() is
>        // Monsters don't collect resources.
>
>    method buildStructures() is
>        // Monsters don't build structures.
>
>    method buildUnits() is
> ```

</details>

<details>
<summary>23. Visitor?</summary>

> **Answer:**
>
> Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
>
> ```
> interface Shape is
>    method move(x, y)
>    method draw()
>    method accept(v: Visitor)
>
> class Dot extends Shape is
>
>    method accept(v: Visitor) is
>        v.visitDot(this)
>
> class Circle extends Dot is
>    method accept(v: Visitor) is
>        v.visitCircle(this)
>
> class Rectangle extends Shape is
>    method accept(v: Visitor) is
>        v.visitRectangle(this)
>
> class CompoundShape implements Shape is
>    method accept(v: Visitor) is
>        v.visitCompoundShape(this)
>
> interface Visitor is
>    method visitDot(d: Dot)
>    method visitCircle(c: Circle)
>    method visitRectangle(r: Rectangle)
>    method visitCompoundShape(cs: CompoundShape)
>
> class XMLExportVisitor is
>    method visitDot(d: Dot) is
>
>    method visitCircle(c: Circle) is
>
>    method visitRectangle(r: Rectangle) is
>
>    method visitCompoundShape(cs: CompoundShape) is
>
>
> class Application is
>    field allShapes: array of Shapes
>
>    method export() is
>        exportVisitor = new XMLExportVisitor()
>
>        foreach (shape in allShapes) do
>            shape.accept(exportVisitor)
> ```

</details>

**[⬆ back to top](#interview-questions)**
