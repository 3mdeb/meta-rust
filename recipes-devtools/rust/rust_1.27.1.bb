require rust.inc
require rust-source-${PV}.inc
require rust-snapshot-${PV}.inc

# These are extracted from rustc/src/bootstrap/Cargo.toml via cargo-bitbake
SRC_URI += " \
crate://crates.io/aho-corasick/0.6.4 \
crate://crates.io/ammonia/1.1.0 \
crate://crates.io/ansi_term/0.11.0 \
crate://crates.io/ar/0.3.1 \
crate://crates.io/arrayvec/0.4.7 \
crate://crates.io/assert_cli/0.5.4 \
crate://crates.io/atty/0.2.8 \
crate://crates.io/backtrace-sys/0.1.16 \
crate://crates.io/backtrace/0.3.6 \
crate://crates.io/bitflags/0.7.0 \
crate://crates.io/bitflags/0.9.1 \
crate://crates.io/bitflags/1.0.1 \
crate://crates.io/bufstream/0.1.3 \
crate://crates.io/bytecount/0.2.0 \
crate://crates.io/byteorder/1.2.2 \
crate://crates.io/cargo_metadata/0.3.3 \
crate://crates.io/cargo_metadata/0.5.4 \
crate://crates.io/cc/1.0.10 \
crate://crates.io/cfg-if/0.1.2 \
crate://crates.io/chrono/0.4.1 \
crate://crates.io/clap/2.31.2 \
crate://crates.io/clippy_lints/0.0.197 \
crate://crates.io/cmake/0.1.30 \
crate://crates.io/colored/1.6.0 \
crate://crates.io/commoncrypto-sys/0.2.0 \
crate://crates.io/commoncrypto/0.2.0 \
crate://crates.io/compiletest_rs/0.3.9 \
crate://crates.io/core-foundation-sys/0.5.1 \
crate://crates.io/core-foundation/0.5.1 \
crate://crates.io/crossbeam-deque/0.2.0 \
crate://crates.io/crossbeam-epoch/0.3.1 \
crate://crates.io/crossbeam-utils/0.2.2 \
crate://crates.io/crossbeam/0.3.2 \
crate://crates.io/crypto-hash/0.3.1 \
crate://crates.io/curl-sys/0.4.2 \
crate://crates.io/curl/0.4.12 \
crate://crates.io/debug_unreachable/0.1.1 \
crate://crates.io/derive-new/0.5.2 \
crate://crates.io/diff/0.1.11 \
crate://crates.io/difference/1.0.0 \
crate://crates.io/difference/2.0.0 \
crate://crates.io/dtoa/0.4.2 \
crate://crates.io/either/1.5.0 \
crate://crates.io/elasticlunr-rs/2.2.0 \
crate://crates.io/ena/0.9.2 \
crate://crates.io/endian-type/0.1.2 \
crate://crates.io/enum_primitive/0.1.1 \
crate://crates.io/env_logger/0.5.8 \
crate://crates.io/environment/0.1.1 \
crate://crates.io/error-chain/0.11.0 \
crate://crates.io/failure/0.1.1 \
crate://crates.io/failure_derive/0.1.1 \
crate://crates.io/filetime/0.1.15 \
crate://crates.io/filetime/0.2.0 \
crate://crates.io/fixedbitset/0.1.9 \
crate://crates.io/flate2/1.0.1 \
crate://crates.io/fnv/1.0.6 \
crate://crates.io/foreign-types-shared/0.1.1 \
crate://crates.io/foreign-types/0.3.2 \
crate://crates.io/fs2/0.4.3 \
crate://crates.io/fuchsia-zircon-sys/0.3.3 \
crate://crates.io/fuchsia-zircon/0.3.3 \
crate://crates.io/futf/0.1.3 \
crate://crates.io/futures/0.1.20 \
crate://crates.io/getopts/0.2.17 \
crate://crates.io/git2-curl/0.8.1 \
crate://crates.io/git2/0.7.1 \
crate://crates.io/glob/0.2.11 \
crate://crates.io/globset/0.3.0 \
crate://crates.io/handlebars/0.32.0 \
crate://crates.io/hex/0.3.1 \
crate://crates.io/home/0.3.2 \
crate://crates.io/html5ever/0.22.0 \
crate://crates.io/humantime/1.1.1 \
crate://crates.io/idna/0.1.4 \
crate://crates.io/if_chain/0.1.2 \
crate://crates.io/ignore/0.4.1 \
crate://crates.io/is-match/0.1.0 \
crate://crates.io/itertools/0.7.8 \
crate://crates.io/itoa/0.4.1 \
crate://crates.io/jobserver/0.1.11 \
crate://crates.io/json/0.11.13 \
crate://crates.io/jsonrpc-core/8.0.1 \
crate://crates.io/kernel32-sys/0.2.2 \
crate://crates.io/languageserver-types/0.39.0 \
crate://crates.io/lazy_static/0.2.11 \
crate://crates.io/lazy_static/1.0.0 \
crate://crates.io/lazycell/0.6.0 \
crate://crates.io/libc/0.2.40 \
crate://crates.io/libgit2-sys/0.7.1 \
crate://crates.io/libssh2-sys/0.2.6 \
crate://crates.io/libz-sys/1.0.18 \
crate://crates.io/log/0.3.9 \
crate://crates.io/log/0.4.1 \
crate://crates.io/log_settings/0.1.1 \
crate://crates.io/lzma-sys/0.1.9 \
crate://crates.io/mac/0.1.1 \
crate://crates.io/maplit/1.0.1 \
crate://crates.io/markup5ever/0.7.2 \
crate://crates.io/matches/0.1.6 \
crate://crates.io/mdbook/0.1.7 \
crate://crates.io/memchr/2.0.1 \
crate://crates.io/memoffset/0.2.1 \
crate://crates.io/miniz-sys/0.1.10 \
crate://crates.io/miow/0.3.1 \
crate://crates.io/nibble_vec/0.0.4 \
crate://crates.io/nodrop/0.1.12 \
crate://crates.io/num-integer/0.1.36 \
crate://crates.io/num-traits/0.1.43 \
crate://crates.io/num-traits/0.2.2 \
crate://crates.io/num_cpus/1.8.0 \
crate://crates.io/open/1.2.1 \
crate://crates.io/openssl-probe/0.1.2 \
crate://crates.io/openssl-sys/0.9.28 \
crate://crates.io/openssl/0.10.6 \
crate://crates.io/ordermap/0.3.5 \
crate://crates.io/owning_ref/0.3.3 \
crate://crates.io/parking_lot/0.5.5 \
crate://crates.io/parking_lot_core/0.2.14 \
crate://crates.io/percent-encoding/1.0.1 \
crate://crates.io/pest/1.0.6 \
crate://crates.io/pest_derive/1.0.7 \
crate://crates.io/petgraph/0.4.12 \
crate://crates.io/phf/0.7.21 \
crate://crates.io/phf_codegen/0.7.21 \
crate://crates.io/phf_generator/0.7.21 \
crate://crates.io/phf_shared/0.7.21 \
crate://crates.io/pkg-config/0.3.9 \
crate://crates.io/precomputed-hash/0.1.1 \
crate://crates.io/pretty_assertions/0.5.1 \
crate://crates.io/proc-macro2/0.2.3 \
crate://crates.io/proc-macro2/0.3.6 \
crate://crates.io/pulldown-cmark/0.1.2 \
crate://crates.io/quick-error/1.2.1 \
crate://crates.io/quine-mc_cluskey/0.2.4 \
crate://crates.io/quote/0.3.15 \
crate://crates.io/quote/0.4.2 \
crate://crates.io/quote/0.5.1 \
crate://crates.io/racer/2.0.13 \
crate://crates.io/radix_trie/0.1.3 \
crate://crates.io/rand/0.3.22 \
crate://crates.io/rand/0.4.2 \
crate://crates.io/rayon-core/1.4.0 \
crate://crates.io/rayon/1.0.1 \
crate://crates.io/redox_syscall/0.1.37 \
crate://crates.io/redox_termios/0.1.1 \
crate://crates.io/regex-syntax/0.5.5 \
crate://crates.io/regex/0.2.10 \
crate://crates.io/remove_dir_all/0.5.1 \
crate://crates.io/rls-analysis/0.12.1 \
crate://crates.io/rls-blacklist/0.1.2 \
crate://crates.io/rls-data/0.15.0 \
crate://crates.io/rls-rustc/0.2.2 \
crate://crates.io/rls-span/0.4.0 \
crate://crates.io/rls-vfs/0.4.5 \
crate://crates.io/rustc-ap-rustc_cratesio_shim/121.0.0 \
crate://crates.io/rustc-ap-rustc_data_structures/121.0.0 \
crate://crates.io/rustc-ap-rustc_errors/121.0.0 \
crate://crates.io/rustc-ap-rustc_target/121.0.0 \
crate://crates.io/rustc-ap-serialize/121.0.0 \
crate://crates.io/rustc-ap-syntax/121.0.0 \
crate://crates.io/rustc-ap-syntax_pos/121.0.0 \
crate://crates.io/rustc-demangle/0.1.7 \
crate://crates.io/rustc-serialize/0.3.24 \
crate://crates.io/rustfix/0.2.0 \
crate://crates.io/same-file/0.1.3 \
crate://crates.io/same-file/1.0.2 \
crate://crates.io/schannel/0.1.12 \
crate://crates.io/scoped-tls/0.1.1 \
crate://crates.io/scopeguard/0.3.3 \
crate://crates.io/semver-parser/0.7.0 \
crate://crates.io/semver/0.8.0 \
crate://crates.io/semver/0.9.0 \
crate://crates.io/serde/1.0.40 \
crate://crates.io/serde_derive/1.0.40 \
crate://crates.io/serde_derive_internals/0.23.1 \
crate://crates.io/serde_ignored/0.0.4 \
crate://crates.io/serde_json/1.0.15 \
crate://crates.io/shell-escape/0.1.4 \
crate://crates.io/shlex/0.1.1 \
crate://crates.io/siphasher/0.2.2 \
crate://crates.io/skeptic/0.13.2 \
crate://crates.io/smallvec/0.6.0 \
crate://crates.io/socket2/0.3.5 \
crate://crates.io/stable_deref_trait/1.0.0 \
crate://crates.io/string_cache/0.7.1 \
crate://crates.io/string_cache_codegen/0.4.0 \
crate://crates.io/string_cache_shared/0.3.0 \
crate://crates.io/strsim/0.7.0 \
crate://crates.io/strum/0.9.0 \
crate://crates.io/strum_macros/0.9.0 \
crate://crates.io/syn/0.11.11 \
crate://crates.io/syn/0.12.15 \
crate://crates.io/syn/0.13.1 \
crate://crates.io/synom/0.11.3 \
crate://crates.io/synstructure/0.6.1 \
crate://crates.io/syntex_errors/0.52.0 \
crate://crates.io/syntex_pos/0.52.0 \
crate://crates.io/syntex_syntax/0.52.0 \
crate://crates.io/tar/0.4.15 \
crate://crates.io/tempdir/0.3.7 \
crate://crates.io/tempfile/3.0.1 \
crate://crates.io/tendril/0.4.0 \
crate://crates.io/term/0.4.6 \
crate://crates.io/term/0.5.1 \
crate://crates.io/termcolor/0.3.6 \
crate://crates.io/termion/1.5.1 \
crate://crates.io/textwrap/0.9.0 \
crate://crates.io/thread_local/0.3.5 \
crate://crates.io/time/0.1.39 \
crate://crates.io/toml-query/0.6.0 \
crate://crates.io/toml/0.2.1 \
crate://crates.io/toml/0.4.6 \
crate://crates.io/ucd-util/0.1.1 \
crate://crates.io/unicode-bidi/0.3.4 \
crate://crates.io/unicode-normalization/0.1.5 \
crate://crates.io/unicode-segmentation/1.2.0 \
crate://crates.io/unicode-width/0.1.4 \
crate://crates.io/unicode-xid/0.0.3 \
crate://crates.io/unicode-xid/0.0.4 \
crate://crates.io/unicode-xid/0.1.0 \
crate://crates.io/unreachable/0.1.1 \
crate://crates.io/unreachable/1.0.0 \
crate://crates.io/url/1.7.0 \
crate://crates.io/url_serde/0.2.0 \
crate://crates.io/userenv-sys/0.2.0 \
crate://crates.io/utf-8/0.7.2 \
crate://crates.io/utf8-ranges/1.0.0 \
crate://crates.io/vcpkg/0.2.3 \
crate://crates.io/vec_map/0.8.0 \
crate://crates.io/void/1.0.2 \
crate://crates.io/walkdir/1.0.7 \
crate://crates.io/walkdir/2.1.4 \
crate://crates.io/winapi-build/0.1.1 \
crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi/0.2.8 \
crate://crates.io/winapi/0.3.4 \
crate://crates.io/wincolor/0.1.6 \
crate://crates.io/xattr/0.2.1 \
crate://crates.io/xz2/0.1.4 \
crate://crates.io/yaml-rust/0.3.5 \
"

DEPENDS += "rust-llvm (=${PV})"

# Otherwise we'll depend on what we provide
INHIBIT_DEFAULT_RUST_DEPS_class-native = "1"
# We don't need to depend on gcc-native because yocto assumes it exists
PROVIDES_class-native = "virtual/${TARGET_PREFIX}rust"

BBCLASSEXTEND = "native"
