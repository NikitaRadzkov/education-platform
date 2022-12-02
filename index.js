const engine = require('unified-engine');
const remark = require('remark');

engine(
  {
    processor: remark,
    files: ['.'],
    extensions: ['md'],
    color: true,
    ignorePatterns: ['**/questions/*', '**/example/*', '**/examples/*'],
    frail: true,
    quiet: true,
    rcName: '.remarkrc'
  },
  done
);

function done(error, code) {
  process.exit(error ? 1 : code);
}
