# Plugin registration system

## Short Description

Implement the register decorator.

## Estimation (h)

4

## Topics

* Decorators with parameters
* Designing types

## Requirements

Review this code for plugin registration:

```python
class WordProcessor:
    PLUGINS = []

    def process(self, text):
        for plug in self.PLUGINS:
            text = plug().cleanup(text)
            return text


@register(WordProcessor.PLUGINS)
class RemoveVovelExtension():
    def cleanup(self, text):
        import re
        return re.sub(r'[eyuioa]', '', text)
```

* Implement the register decorator
